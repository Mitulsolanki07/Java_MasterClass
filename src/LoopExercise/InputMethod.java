package LoopExercise;

import java.io.File;
import java.util.Scanner;

public class InputMethod {
    public static void main(String[] args) {
        int currYear = 2024;
        try {
            System.out.println(getInputSystemConsole(currYear));
        } catch (NullPointerException e) {
            System.out.println(getInputSystemScanner(currYear));
        }
    }

    public static String getInputSystemConsole(int currYear) {
        String name = System.console().readLine("What's your name? ");
        System.out.println("Hello " + name + ", Thanks for Learning Java!");
        String bornYear = System.console().readLine("which is your born Year? ");
        int iAge = currYear - Integer.parseInt(bornYear);
        return "Hello " + name + " you are " + iAge + " years old!";
    }

    public static String getInputSystemScanner(int currYear) {
// read input from file
//        Scanner scanner = new Scanner(new File("FileNameinYourSystem"));
        //        read input from terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
//        String name = System.console().readLine("What's your name? ");
        System.out.println("Hello " + name + ", Thanks for Learning Java!");
        System.out.println("which is your born Year? ");
        boolean ValidData = false;
        int iAge = 0;
        do {
            System.out.println("Enter Date of birth year between range " + (currYear - 150) + " to " + currYear);
            //        String bornYear = System.console().readLine("which is your born Year? ");
            try {

                iAge = checkData(currYear, scanner.nextLine());
                ValidData = iAge < 0 ? false : true;
            } catch (NumberFormatException badUserInput) {
                System.out.println("Try Again, Character are not allowed!");
            }
        } while (!ValidData);
        return "Hello " + name + " you are " + iAge + " years old!";
    }

    public static int checkData(int currYear, String DateOfBirth) {
        int Dob = Integer.parseInt(DateOfBirth);
        int minYearRange = currYear - 150;
        if (minYearRange > Dob && Dob < currYear) {
            return -1;
        }
        return currYear - Dob;
    }
}
