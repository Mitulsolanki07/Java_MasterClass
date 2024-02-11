package LoopExercise;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("is Number 6 is perfect " + isPerfectNumber(6));
        System.out.println("is Number 10 is perfect " + isPerfectNumber(10));
        System.out.println("is Number 28 is perfect " + isPerfectNumber(28));
        System.out.println("is Number -1 is perfect " + isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sumOfDivisor = 0;
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                sumOfDivisor += i;
            }
        }
        if (sumOfDivisor == number) {
            return true;
        }
        return false;
    }
}

