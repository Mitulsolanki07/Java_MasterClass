package LoopExercise;

public class sharedDigit {
    public static void main(String[] args) {
        int a = 12, b = 23;
        int c = 0;
        System.out.println("C is " + c);
        System.out.println("hasSharedDigits for number a: " + a + " , b: " + b + " = " + hasSharedDigit(a, b));
        a = 9;
        b = 99;
        System.out.println("hasSharedDigits for number a: " + a + " , b: " + b + " = " + hasSharedDigit(a, b));
        a = 15;
        b = 55;
        System.out.println("hasSharedDigits for number a: " + a + " , b: " + b + " = " + hasSharedDigit(a, b));

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 | number1 > 99) | (number2 < 10 | number2 > 99)) {
            System.out.println("should return false since a or b " + number1 + ", " + number2 + " is not within the range of 10-99");
            return false;
        } else {

            return (number1 % 10 == number2 / 10 | number1 / 10 == number2 / 10 | number1 / 10 == number2 % 10 | number1 % 10 == number2 % 10);
        }
    }
}
