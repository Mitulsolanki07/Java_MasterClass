public class CalcFinalGameScore {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        System.out.println("Final score is : " + calcFinalScore(gameOver, score, levelCompleted, bonus));
        System.out.println("Final score is : " + calcFinalScore(true, 800, 5, 100));
    }

    //learn how to create method in java
//    i. access modifiers & method return type
//    ii. method name
//    iii. method 1 or more args optionally
    public static int calcFinalScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
