package com.example.hellorest.user;

public class Company {
    private String name;
    private String catchPhrases;
    private String bs;

    public Company() {
    }

    public Company(String name, String catchPhrases, String bs) {
        this.name = name;
        this.catchPhrases = catchPhrases;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrases() {
        return catchPhrases;
    }

    public String getBs() {
        return bs;
    }
}
