package com.example.hellomavenrest.externalUsers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class ExternalUserController {
    @Autowired
    private UserGateway userGateway;

    @GetMapping("/ex-users")
    public ExternalUser getAllEvenIdUsers(){
        List<ExternalUserModel> result = this.userGateway.getEvenIdUsers();
        ExternalUser users = new ExternalUser();
        users.setUsers(result);
        return users;
    }
}
