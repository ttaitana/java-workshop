package com.example.hellomavenrest.externalUsers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserGatewayTest {
    @Autowired
    private UserGateway userGateway;

    @Test
    public void callingAPI(){
        List<ExternalUserModel> users = userGateway.getAllUsers();
        assertEquals(10, users.size());
    }

    @Test
    public void tryToCallAPIGetUserById() {
        ExternalUserModel user = userGateway.getUserById(1);
        assertEquals(1, user.getId());
        assertEquals("Leanne Graham", user.getName());
    }

    @Test
    public void getUsersWhereIdIsEven(){
        List<ExternalUserModel> users = userGateway.getEvenIdUsers();
        assertEquals(5, users.size());
    }
}