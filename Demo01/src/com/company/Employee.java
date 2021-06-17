package com.company;

public class Employee {
    private int id;
    private String fname;
    private String lname;

    public Employee() {
        this("?", "?");
    }

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFullName() {
        return fname + " : " + lname;
    }
}
