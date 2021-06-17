package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    @DisplayName("Create new employee object then call getFullName should return initial name.")
    public void testCases(){
        String exceptResult = "Robin Hood";
        Employee user = new Employee("Robin", "Hood");
        String actualResult = user.getFullName();
        assertEquals(exceptResult, actualResult);
    }

    @Test
    @DisplayName("Create new employee object without initial value should set name as empty value")
    public void testCases2(){
        String exceptResult = " ";
        Employee user = new Employee();
        String actualResult = user.getFullName();
        assertEquals(exceptResult, actualResult);
    }
}