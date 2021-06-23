package com.example.hellomavenrest.externalUsers;

import java.util.List;

public class ExternalUser {
    private List<ExternalUserModel> users;

    public List<ExternalUserModel> getUsers() {
        return users;
    }

    public void setUsers(List<ExternalUserModel> users) {
        this.users = users;
    }
}
