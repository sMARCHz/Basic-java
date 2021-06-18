package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID {
    Random random = new Random();

    public String get(String name) {
        String id = "";
        int randomNumber = random.nextInt(10);
        id = "XYZ" + name + randomNumber;
        return id;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
