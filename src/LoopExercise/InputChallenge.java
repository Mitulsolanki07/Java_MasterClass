package LoopExercise;

import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        int totalInput = 5;
        boolean isValidData = false;
        int sumOfNum = 0;
        Scanner scanner = new Scanner(System.in);
        while (totalInput != 0) {
            try {
                System.out.println("Enter Number #" + (6 - totalInput) + ": ");
                int inpNum = checkData(scanner.nextLine());
                isValidData = inpNum < 0 ? false : true;
                if (isValidData) {
                    sumOfNum += inpNum;
                    totalInput -= 1;
                } else {
                    System.out.println("please Input Non Negative Number");
                }
            } catch (NumberFormatException badUserInput) {
                System.out.println("try Again, Please Enter Valid Number!");
            }
        }
        System.out.println("Sum of Input Number is " + sumOfNum);
    }

    public static int checkData(String inpNumber) {
        int number = Integer.parseInt(inpNumber);
        if (number < 0) {
            return -1;
        }
        return number;
    }
}
