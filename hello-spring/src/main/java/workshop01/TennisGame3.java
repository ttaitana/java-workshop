package workshop01;

public class TennisGame3 {

    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Number, String player2Name) {
        this.player1Name = player1Number;
        this.player2Name = player2Name;
    }

    public String getScore() {
        if (isNormalGame()) {
            String[] point = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            String displayScore = point[player1Score];
            return (player1Score == player2Score) ? displayScore + "-All" : displayScore + "-" + point[player2Score];
        }
        if (player1Score == player2Score)
            return "Deuce";
        String advantagePlayer = player1Score > player2Score ? player1Name : player2Name;
        return (Math.abs(player1Score - player2Score) == 1) ? "Advantage " + advantagePlayer : "Win for " + advantagePlayer;
    }

    private boolean isNormalGame() {
        return player1Score < 4 && player2Score < 4 && player1Score + player2Score != 6;
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.player1Score += 1;
        else
            this.player2Score += 1;
    }

}