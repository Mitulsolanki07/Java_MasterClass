package LoopExercise;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        boolean ValidData = true;
        int minNumber = 0, maxNumber = 0;
        Scanner scanner = new Scanner(System.in);
        while (ValidData) {
            try {
                System.out.println("Enter Numbers to Determine Min , Max");
                int number = isValidNumber(scanner.nextLine());
                if (minNumber == 0 && maxNumber == 0) {
                    minNumber = number;
                    maxNumber = number;
                } else if (minNumber > number) {
                    minNumber = number;
                } else if (maxNumber < number) {
                    maxNumber = number;
                }
            } catch (NumberFormatException badUserInput) {
                ValidData = false;
            }
        }
        System.out.println("Minimum: " + minNumber + " and Maximum Number: " + maxNumber);
    }

    public static int isValidNumber(String inpNum) {
        int number = Integer.parseInt(inpNum);
        return number;
    }
}
