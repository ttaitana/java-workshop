package com.example.hellomavenrest.employee;

import java.util.Objects;

public class EmployeeRequest {
    private String fname;
    private String lname;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EmployeeRequest)) return false;
		EmployeeRequest that = (EmployeeRequest) o;
		return Objects.equals(getFname(), that.getFname()) &&
				Objects.equals(getLname(), that.getLname());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getFname(), getLname());
	}

	public EmployeeRequest() {
    }

    public EmployeeRequest(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
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
}
