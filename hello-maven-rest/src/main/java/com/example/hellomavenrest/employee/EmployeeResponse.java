package com.example.hellomavenrest.employee;

import java.util.Objects;

public class EmployeeResponse {
    private String fname;
    private String lname;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeResponse)) return false;
        EmployeeResponse that = (EmployeeResponse) o;
        return getId() == that.getId() &&
                Objects.equals(getFname(), that.getFname()) &&
                Objects.equals(getLname(), that.getLname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFname(), getLname(), getId());
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
