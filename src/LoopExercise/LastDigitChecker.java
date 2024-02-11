package LoopExercise;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Has Same Last Digit: " + hasSameLastDigit(41, 22, 71));
        System.out.println("Has Same Last Digit: " + hasSameLastDigit(23, 32, 42));
        System.out.println("Has Same Last Digit: " + hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 < 10 || num2 < 10 || num3 < 10) || (num1 > 1000 || num2 > 1000 || num3 > 1000)) {
            return false;
        }
        boolean bIsMatch12 = num1 % 10 == num2 % 10, bIsMatch13 = num1 % 10 == num3 % 10, bIsMatch23 = num2 % 10 == num3 % 10;
        return ((bIsMatch12 == bIsMatch13) || (bIsMatch23 == bIsMatch12) || (bIsMatch13 == bIsMatch23));
    }
}
