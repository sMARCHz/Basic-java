package com.example.hellorest.user;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(catchPhrases, company.catchPhrases) && Objects.equals(bs, company.bs);
    }
}
