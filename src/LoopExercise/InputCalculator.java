package LoopExercise;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int SumOfNum = 0;
        long AvgNum = 0l;
        int lenOfNum = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isValidData = true;
        while (isValidData) {
            try {
                int Number = ValidData(scanner.nextLine());
                SumOfNum += Number;
                lenOfNum += 1;
            } catch (NumberFormatException badUserInput) {
                isValidData = false;
                System.out.println("Please enter Valid Number");
            } catch (ArithmeticException badUserInput) {
                isValidData = false;
                System.out.println("Please enter Valid Number");
            }
        }
        try {
            AvgNum = Math.round((double) (SumOfNum / lenOfNum));
        } catch (ArithmeticException DivideByZero) {
            System.out.println("WARN");
        }
        System.out.println("SUM= " + SumOfNum + " AVG= " + AvgNum);
    }

    public static int ValidData(String number) {
        int iNum = Integer.parseInt(number);
        return iNum;
    }
}

