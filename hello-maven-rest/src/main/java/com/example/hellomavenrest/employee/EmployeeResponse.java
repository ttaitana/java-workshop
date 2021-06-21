package com.example.hellomavenrest.employee;

public class EmployeeResponse {
    private String fname;
    private String lname;
    private int id;

    @Override
    public String toString() {
        return String.format("id: %d, %s %s", this.getId(), this.getFname(), this.getLname());
    }

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
