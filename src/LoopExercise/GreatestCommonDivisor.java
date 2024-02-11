package LoopExercise;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Greatest Common Divisor: " + getGreatestCommonDivisor(25, 15));
        System.out.println("Greatest Common Divisor: " + getGreatestCommonDivisor(12, 30));
        System.out.println("Greatest Common Divisor: " + getGreatestCommonDivisor(9, 18));
        System.out.println("Greatest Common Divisor: " + getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int number = 0;
        if (first > second) {
            number = second;
        } else {
            number = first;
        }
        for (int i = number; i > 0; i--) {
            if (((first % i) == 0) && ((second % i) == 0)) {
                return i;
            }
        }
        return -1;
    }
}
