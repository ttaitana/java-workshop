package com.example.hellomavenrest.employee;

import java.util.Objects;

public class EmployeeRequest {
    private String firstName;
    private String lastName;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EmployeeRequest)) return false;
		EmployeeRequest that = (EmployeeRequest) o;
		return Objects.equals(getFirstName(), that.getFirstName()) &&
				Objects.equals(getLastName(), that.getLastName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getFirstName(), getLastName());
	}

	public EmployeeRequest() {
    }

    public EmployeeRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
