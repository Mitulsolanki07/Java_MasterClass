package LoopExercise;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("121 is palindrome : " + isPalindrome(121));
        System.out.println(" is palindrome: " + isPalindrome(1345));
    }

    public static boolean isPalindrome(int number) {
        int OriginalNumber = number;
        int reverseNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = (reverseNumber * 10 + remainder);
            number /= 10;
        }
        if (OriginalNumber == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}
