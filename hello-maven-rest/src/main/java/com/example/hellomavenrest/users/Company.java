package com.example.hellomavenrest.users;

public class Company {
    private String bs;
    private String catchPhrase;
    private String name;

    public Company() {
    }

    public Company(String bs, String catchPhrase, String name) {
        this.bs = bs;
        this.catchPhrase = catchPhrase;
        this.name = name;
    }

    public String getBs() {
        return bs;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getName() {
        return name;
    }
}
