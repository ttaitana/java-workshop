package com.example.hellomavenrest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerMockBeanTest {
    @MockBean
    NumberRandom random;

    @Autowired TestRestTemplate restTemplate;

    @MockBean EmployeeRepository employeeRepository;

//    @Test
//    public void callAPIWithPathVariable(@Autowired TestRestTemplate restTemplate){
//        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);
//        assertEquals(123, response.getId());
//        assertEquals("Taitana", response.getFname());
//        assertEquals("Yumee", response.getLname());
//    }

//    @Test
//    public void callAPIWithQueryVariable(){
//        EmployeeResponse response = restTemplate.getForObject("/employee?id=12", EmployeeResponse.class);
//        assertEquals(12, response.getId());
//        assertEquals("Taitana", response.getFirstName());
//        assertEquals("Yumee", response.getLastName());
//    }

    @Test
    public void callAPIWithPathVariableWithoutDatabase(){
//      ? Mocking
//        when(random.nextInt(anyInt())).thenReturn(5);
        EmployeeEntity mock = new EmployeeEntity(123, "Taitana", "Yumee");
        when(employeeRepository.findById(123)).thenReturn(Optional.of(mock));

//       ? Create Data
        employeeRepository.save(new EmployeeEntity(123, "Taitana", "Yumee"));

//       ? Call API
        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);

//       ? Testing Zone
        EmployeeResponse expect = new EmployeeResponse(123, "Taitana", "Yumee");
        assertEquals(123, response.getId());
        assertEquals("Taitana", response.getFirstName());
        assertEquals("Yumee", response.getLastName());
        assertEquals(expect, response);
    }

    @Test
    public void callAPIWithPathVariableWithoutDatabaseAndEmployeeNotFound(){
//      ? Mocking
//        when(random.nextInt(anyInt())).thenReturn(5);
        EmployeeEntity mock = new EmployeeEntity(123, "Taitana", "Yumee");
        when(employeeRepository.findById(123)).thenReturn(Optional.empty());

//       ? Create Data
        employeeRepository.save(new EmployeeEntity());

//       ? Call API
        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);

//       ? Testing Zone
        EmployeeResponse expect = new EmployeeResponse();
        assertEquals(0, response.getId());
        assertEquals(null, response.getFirstName());
        assertEquals(null, response.getLastName());
        assertEquals(expect, response);
    }

//    @Test
//    public void callCreateEmployeeApi(){
//        when(random.nextInt(anyInt())).thenReturn(1);
//        EmployeeResponse expect = new EmployeeResponse(1, "Taitana", "Yumee");
//        EmployeeRequest req = new EmployeeRequest("Taitana", "Yumee");
//        EmployeeResponse response = restTemplate.postForObject("/employee", req,  EmployeeResponse.class);
//        assertEquals(expect, response);
//    }
}