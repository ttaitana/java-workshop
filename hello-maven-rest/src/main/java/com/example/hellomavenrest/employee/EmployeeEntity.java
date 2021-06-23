package com.example.hellomavenrest.employee;

import javax.persistence.*;

@Entity
public class EmployeeEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public EmployeeEntity(){}

    public EmployeeEntity(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public EmployeeEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column private String firstName;

    @Column private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
