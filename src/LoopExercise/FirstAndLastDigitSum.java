package LoopExercise;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of first and last digit 258: " + sumFirstAndLastDigit(258));
        System.out.println("Sum of first and last digit 0: " + sumFirstAndLastDigit(0));
        System.out.println("Sum of first and last digit -13: " + sumFirstAndLastDigit(-13));

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            int lastNumber = (number % 10);
            int firstNumber = (int) (number / (int) Math.pow(10, (int) Math.log10(number)));
            return firstNumber + lastNumber;
        }
    }
}
