package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("When create instance with default constructor, fullname = : ")
    public void case01() {
        String expectedResult = " : ";
        Employee employee = new Employee();
        String actualResult = employee.getFullName();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("When create instance with John Smith, fullname = John : Smith")
    public void case02() {
        String expectedResult = "John : Smith";
        Employee employee = new Employee("John", "Smith");
        String actualResult = employee.getFullName();
        assertEquals(expectedResult, actualResult);
    }
}