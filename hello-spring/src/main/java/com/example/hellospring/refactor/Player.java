package com.example.hellospring.refactor;

public class Player {
    private int score = 0;
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void wonPoint() {
        this.score += 1;
    }

    public String getName() {
        return name;
    }

}
