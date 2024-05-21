package Practise;

import BurgerChallenge.MealOrder;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        String myStr = "ABC";
        char myChar = 'C';
        char myAnChar = 67;
        char myAnAnChar = '\u0002';
        System.out.println(" " + myChar + myAnChar + myAnAnChar);
        System.out.printf("True And false Operator-> %b & true OR false Operator-> %b %n", Boolean.logicalAnd(true, false), Boolean.logicalOr(true, false));
        System.out.println("String Concatenate with boolean data type" + true);
        System.out.println("String Concatenate with int, float, short, long, double, byte, long data type" + 21);
        System.out.println("String concatenate with char " + 'c');
        String myConvString = String.valueOf(8);
        System.out.println("Converted String value " + myConvString);

        StringBuilder myBuilder = new StringBuilder(32);
        myBuilder.append("Mitul" + "Solanki");
        System.out.println(myBuilder + " length of string: " + myBuilder.length() + ", capacity: " + myBuilder.capacity());

        byte myByte = 12;
        short myShort = (short) myByte;
        int myInt = (int) myShort;
        byte AnoByte = (byte) (myShort + myInt);
        double myLong = (double) myByte;
        System.out.println("Int Converted " + myInt + " Short Converted " + myLong);
        System.out.printf("Byte value: %d and Short value is %s %d %n", myByte, myShort, AnoByte);
//        System.out.println(10 % 0);
        System.out.println("MitulSolanki");
        String reverseStr = "";
        String s = "MitulSolanki";
        for (int idx = s.length() - 1; idx >= 0; idx--) {
            char currChar = s.charAt(idx);
            reverseStr += currChar;
        }
        System.out.println(reverseStr.length());
//        reverseStr.chars() ="X";
        System.out.println((reverseStr.toCharArray()).length);
        StringBuilder myStrBuilder = new StringBuilder();
        myStrBuilder.append("Hello World");
        System.out.println(myStrBuilder);
        System.out.println(myStrBuilder.append(" Hey Baby! Whats Up"));
        System.out.println(myStrBuilder.replace(5, 8, "Mitul Solanki"));
        System.out.println(("Mitul Solanki".toCharArray()).length);

        char myCharArr[] = ((String) ("Geeks" + "forGeeks")).toCharArray();
        System.out.println(myCharArr);
        for (int idx = 0; idx < myCharArr.length / 2; idx++) {
            char temp = myCharArr[myCharArr.length - 1 - idx];
            myCharArr[myCharArr.length - 1 - idx] = myCharArr[idx];
            myCharArr[idx] = temp;
        }
        System.out.println(myCharArr.toString());
        int q = 10;
        System.out.print((int) Math.pow(q, 2));
        String myStr2 = "LMNOppQQ";
        char myCharArr2[] = myStr2.toCharArray();
        for (int idx = 0; idx < myCharArr2.length; idx++) {
            if (myCharArr2[idx] >= 65 && myCharArr2[idx] <= 90) {
                myCharArr2[idx] += 32;
            }
        }
        System.out.println(new String(myCharArr2));
        System.out.println("Hello".substring(0, 5));

        // Create a StringBuilder to build the modified string
        StringBuilder result = new StringBuilder();

        // Iterate over myStr2 and add characters at even indices to the result
        for (int idx = 0; idx < myStr2.length(); idx += 2) {
            result.append(myStr2.charAt(idx));
        }

        // Print the result
        System.out.println(result.toString());

        System.out.println((int) (Math.pow(2, 2) + Math.pow(3, 2)) + Math.PI);
        switch (1) {
            case 1 -> {
                System.out.println((double) (2 * Math.pow(3, 2) * Math.PI));
            }
            case 2 -> {
                System.out.println((double) (2 * 3));
            }
        }
    }

    public static void Test() {
        MealOrder mealOrder = new MealOrder("deluxe", "7-up", "CHILLI NACHOOS");
        mealOrder.addBurgerToppings("CHEESE", "CORN", "Desi SPICY", "JALPENO", "CHOCOMOCO");
        mealOrder.setDrinkSize("LARGE");
        mealOrder.printItemizedList();
    }
}
