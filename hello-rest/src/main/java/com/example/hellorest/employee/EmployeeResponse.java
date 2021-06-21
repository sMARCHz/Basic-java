package com.example.hellorest.employee;

public class EmployeeResponse {

    private String fname;
    private int id;
    private String lname;

    public EmployeeResponse(int id, String fname, String lname) {
        this.fname = fname;
        this.id = id;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

}
