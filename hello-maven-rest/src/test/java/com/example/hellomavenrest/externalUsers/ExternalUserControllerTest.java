package com.example.hellomavenrest.externalUsers;

import com.example.hellomavenrest.employee.EmployeeResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ExternalUserControllerTest {
    @Autowired
    private UserGateway userGateway;

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void getUsersWhereIdIsEven(){
        ExternalUser users = restTemplate.getForObject("/ex-users", ExternalUser.class);
        assertEquals(5, users.getUsers().size());
    }

    @Test
    public void getUsersWhereIdIsEvenCheckEveryUsers(){
        ExternalUser users = restTemplate.getForObject("/ex-users", ExternalUser.class);
        users.getUsers().forEach(user -> assertEquals(true, user.getId() % 2 == 0));
    }
}