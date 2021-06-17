package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("When create instace with default constructor, fullname = : ")
    public void getFullName() {
        String expectedResult = " : ";
        Employee employee = new Employee();
        String actualResult = employee.getFullName();
        assertEquals(expectedResult, actualResult);
    }
}