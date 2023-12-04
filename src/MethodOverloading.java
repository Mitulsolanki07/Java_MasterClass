public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    // changing return type of method, changing parameter name does not make it unique method signature
// Unique Methods signature requires : changing number of arguments , type , order  on method declaration
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored  " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player name, no player score!");
        return 0;
    }
    //    java methods does not support default parameter value , it allows methods overloading for instance
//    public static int calculateScore(int score){
//        calculateScore("Anonymous", 100);
//        return score * 1000;
//    }
}
