package com.example.hellomavenrest.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping("/users")
    public UsersResponse getAllUsers(){
        return new UsersResponse();
    }
}
