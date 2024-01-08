package LoopExercise;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of Even Digits in 123456789 input: " + getEvenDigitSum(123456789));
        System.out.println("Sum of Even Digits in 252 input:" + getEvenDigitSum(252));
        System.out.println("Sum of Even Digits in -122 input:" + getEvenDigitSum(-122));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sumOfEvenNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            if (remainder % 2 == 0) {
                sumOfEvenNumber += remainder;
            }
            number /= 10;
        }
        return sumOfEvenNumber;
    }
}
