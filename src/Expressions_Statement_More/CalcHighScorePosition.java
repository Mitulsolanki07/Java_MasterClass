package Expressions_Statement_More;

public class CalcHighScorePosition {
    public static void main(String[] args) {
//    1500,1000,500,100,25
        displayHighScorePosition("PS Solanki", calculateHighScorePosition(1500));
        displayHighScorePosition("Sam", calculateHighScorePosition(1000));
        displayHighScorePosition("Altman", calculateHighScorePosition(500));
        displayHighScorePosition("Rocky", calculateHighScorePosition(100));
        displayHighScorePosition("Superman", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPos) {
        System.out.println(playerName + " managed to get into position " + playerPos + " on the high score list");
    }

    //    learn how to create if else-if else condition
    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000)
            position = 1;
        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >= 100)
            position = 3;

        return position;
    }
}
