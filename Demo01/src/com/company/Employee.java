package com.company;

public class Employee {
    private int id;
    private String fname;
    private String lname;

    public String getFullName() {
        return fname + " : " + lname;
    }
}
