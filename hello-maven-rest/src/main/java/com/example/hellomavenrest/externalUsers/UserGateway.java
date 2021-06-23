package com.example.hellomavenrest.externalUsers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserGateway {
    @Autowired
    private RestTemplate restTemplate;

    public List<ExternalUserModel> getAllUsers(){
        ExternalUserModel[] result = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", ExternalUserModel[].class);
        return Arrays.asList(result);
    }

    public List<ExternalUserModel> getEvenIdUsers(){
        List<ExternalUserModel> result = this.getAllUsers();
        result = result.stream().filter(user -> user.getId() % 2 == 0).collect(Collectors.toList());
        return result;
    }

    public ExternalUserModel getUserById(int id) {
        String url = "https://jsonplaceholder.typicode.com/users/" + id;
        ExternalUserModel user = restTemplate.getForObject(url, ExternalUserModel.class);
        return user;
    }
}
