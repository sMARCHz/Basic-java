package com.example.hellospring.refactor;

public class TennisGame3 {
    private final Player player1;
    private final Player player2;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public boolean isBeforeFirstDeuce() {
        int player1Score = player1.getScore();
        int player2Score = player2.getScore();
        boolean isBothPlayerScoreLessThanFour = (player1Score<4 && player2Score<4);
        boolean isSumOfPlayerScoreNotEqualSix = !(player1Score + player2Score == 6);
        return isBothPlayerScoreLessThanFour && isSumOfPlayerScoreNotEqualSix;
    }

    public boolean isDraw() {
        return player1.getScore() == player2.getScore();
    }

    public String getCall(int point) {
        switch (point) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                throw new IllegalArgumentException("Invalid point. Point must be greater than 3.");
        }
    }

    public String getScore() {
        int player1Score = player1.getScore();
        int player2Score = player2.getScore();
        if (isBeforeFirstDeuce()) {
            String player1Call = getCall(player1Score);
            String player2Call = getCall(player2Score);
            if (isDraw()) {
                return player1Call + "-All";
            }
            else {
                return player1Call + "-" + player2Call;
            }
        } else {
            if (isDraw()) return "Deuce";
            String leadingPlayer = player1Score > player2Score ? player1.getName() : player2.getName();
            boolean isLeadingPlayerOnAdvantage = ((player1Score-player2Score)*(player1Score-player2Score) == 1);
            if(isLeadingPlayerOnAdvantage) {
                return "Advantage " + leadingPlayer;
            } else{
                return "Win for " + leadingPlayer;
            }
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.getName()))
            this.player1.wonPoint();
        else if(playerName.equals(player2.getName()))
            this.player2.wonPoint();
        else
            throw new IllegalArgumentException("Player with this name doesn't exist in the game.");
    }
}
