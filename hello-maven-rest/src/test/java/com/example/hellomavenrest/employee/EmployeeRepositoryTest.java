package com.example.hellomavenrest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository repository;

    @Test
    public void fouldWithId1(){
        EmployeeEntity employee1 = repository.getById(1);
        assertEquals(1, employee1.getId());
        assertEquals("ttaitana", employee1.getFirstName());
        assertEquals("yumee", employee1.getLastName());
    }
}