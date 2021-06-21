package com.example.hellomavenrest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.*;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {
//    @Test
//    public void callAPIWithPathVariable(@Autowired TestRestTemplate restTemplate){
//        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);
//        assertEquals(123, response.getId());
//        assertEquals("Taitana", response.getFname());
//        assertEquals("Yumee", response.getLname());
//    }

    @Test
    public void callAPIWithQueryVariable(@Autowired TestRestTemplate restTemplate){
        EmployeeResponse response = restTemplate.getForObject("/employee?id=12", EmployeeResponse.class);
        assertEquals(12, response.getId());
        assertEquals("Taitana", response.getFname());
        assertEquals("Yumee", response.getLname());
    }

    @Test
    public void callAPIWithPathVariableCompareWithObject(@Autowired TestRestTemplate restTemplate){
        EmployeeResponse expect = new EmployeeResponse(123, "Taitana5", "Yumee");
        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        assertEquals(123, response.getId());
        assertEquals("Taitana5", response.getFname());
        assertEquals("Yumee", response.getLname());
        assertEquals(expect, response);
    }
}