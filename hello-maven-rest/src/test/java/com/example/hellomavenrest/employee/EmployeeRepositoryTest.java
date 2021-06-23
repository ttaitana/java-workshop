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
    public void foundWithId1(){
        EmployeeEntity data = new EmployeeEntity(1, "ttaitana", "yumee");
        repository.save(data);

        EmployeeEntity employee1 = repository.getById(1);
        assertEquals(1, employee1.getId());
        assertEquals("ttaitana", employee1.getFirstName());
        assertEquals("yumee", employee1.getLastName());
    }

//    @Test
//    public void foundWithId2(){
//        EmployeeEntity data = new EmployeeEntity("ttaitana", "yumee");
//        repository.save(data);
//
//        EmployeeEntity employee1 = repository.getById(1);
//        assertEquals(1, employee1.getId());
//        assertEquals("ttaitana", employee1.getFirstName());
//        assertEquals("yumee", employee1.getLastName());
//    }
}