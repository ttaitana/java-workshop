package com.example.hellomavenrest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.*;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {
    @MockBean
    NumberRandom random;

    @Autowired TestRestTemplate restTemplate;

//    @Test
//    public void callAPIWithPathVariable(@Autowired TestRestTemplate restTemplate){
//        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);
//        assertEquals(123, response.getId());
//        assertEquals("Taitana", response.getFname());
//        assertEquals("Yumee", response.getLname());
//    }

    @Test
    public void callAPIWithQueryVariable(){
        EmployeeResponse response = restTemplate.getForObject("/employee?id=12", EmployeeResponse.class);
        assertEquals(12, response.getId());
        assertEquals("Taitana", response.getFirstName());
        assertEquals("Yumee", response.getLastName());
    }

    @Test
    public void callAPIWithPathVariableCompareWithObject(){
//      ? Mocking
        when(random.nextInt(anyInt())).thenReturn(5);

        EmployeeResponse response = restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        EmployeeResponse expect = new EmployeeResponse(123, "Taitana5", "Yumee");
        assertEquals(123, response.getId());
        assertEquals("Taitana5", response.getFirstName());
        assertEquals("Yumee", response.getLastName());
        assertEquals(expect, response);
    }

    @Test
    public void callCreateEmployeeApi(){
        when(random.nextInt(anyInt())).thenReturn(1);
        EmployeeResponse expect = new EmployeeResponse(1, "Taitana", "Yumee");
        EmployeeRequest req = new EmployeeRequest("Taitana", "Yumee");
        EmployeeResponse response = restTemplate.postForObject("/employee", req,  EmployeeResponse.class);
        assertEquals(expect, response);
    }
}