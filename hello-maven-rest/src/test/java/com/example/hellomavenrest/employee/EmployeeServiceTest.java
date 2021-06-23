package com.example.hellomavenrest.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {
    @Mock
    private Random random;

    @Mock
    private EmployeeRepository employeeRepository;

    @BeforeEach
    public void setupMock() {
        when(random.nextInt(10)).thenReturn(10);
    }

    @Test
    public void foundEmployee(){

        EmployeeEntity mock = new EmployeeEntity(1, "Service name", "Service lname");
        when(employeeRepository.findById(1)).thenReturn(Optional.of(mock));

        EmployeeService service = new EmployeeService();
        service.setRandom(random);
        service.setEmployeeRepository(employeeRepository);
        EmployeeResponse result = service.getUser(1);
        assertEquals(1, result.getId());
        assertEquals("Service name10", result.getFirstName());
        assertEquals("Service lname", result.getLastName());
    }

    @Test
    public void foundEmployeeNotFound(){
        EmployeeService service = new EmployeeService();
        service.setEmployeeRepository(employeeRepository);
        service.setRandom(random);

        Exception exception = assertThrows(EmployeeNotFoundException.class, () -> service.getUser(100));

        assertEquals("Employee id 100 not found", exception.getMessage());
    }
}