package com.example.hellospring.refactor;

public class TennisGame3 {
    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {
            String[] callList = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            String player1Call = callList[player1Score];
            String player2Call = callList[player2Score];
            return (player1Score == player2Score) ? player1Call + "-All" : player1Call + "-" + player2Call;
        } else {
            if (player1Score == player2Score)
                return "Deuce";
            String leadingPlayer = player1Score > player2Score ? player1Name : player2Name;
            return ((player1Score-player2Score)*(player1Score-player2Score) == 1) ? "Advantage " + leadingPlayer : "Win for " + leadingPlayer;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1Score += 1;
        else
            this.player2Score += 1;

    }
}
