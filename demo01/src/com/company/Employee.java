package com.company;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
//    private Department department;
    private String positionName;

    public Employee(){
        this("", "");
    }
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.firstName + ' ' + this.lastName;
    }

    public String getPositionName(){
        return "return user's position";
    }

    public int getId() {
        return id;
    }
}
