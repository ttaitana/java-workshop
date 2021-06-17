package com.company;

public class Employee {
    //attributes
    private int id;
    private String firstName;
    private String lastName;
//    private Department department;
    private String positionName;

    //methods

    public String getFullName(){
        return this.firstName + ' ' + this.lastName;
    }

    public String getPositionName(){
        return "return user's position";
    }
}
;