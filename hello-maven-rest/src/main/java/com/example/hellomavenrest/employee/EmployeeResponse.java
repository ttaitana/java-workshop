package com.example.hellomavenrest.employee;

public class EmployeeResponse {
    private String fname;
    private String lname;
    private int id;

    public EmployeeResponse() {
    }

    public EmployeeResponse(int id, String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
