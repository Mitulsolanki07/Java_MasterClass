package InheritanceChallenge;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {
//        there are three string method categories i. String Inspection ii. String Comparison iii. String Manipulation
        printInformation("");
        printInformation("    ");
        printInformation("Hello World");
        String myStr = "Hello World";
        System.out.printf("index of r: %d%n", myStr.indexOf("r"));
        System.out.printf("index of l: %d%n", myStr.indexOf("l"));
        System.out.printf("index of l: %d%n", myStr.lastIndexOf("l"));

        System.out.printf("index of l: %d%n", myStr.indexOf("l", 3));
        System.out.printf("index of l: %d%n", myStr.lastIndexOf("l", 8));

        System.out.println(myStr.contains("Hello"));
        System.out.println(myStr.equals("hello world"));
//        difference between equals vs contentEquals is StringBuilder comparison is not supported in equals() i.e. its available in contentEquals
        if (myStr.contentEquals("Hello World")) {
            System.out.println("Strings are exactly matched");
        }
        if (myStr.equals(myStr.toLowerCase())) {
            System.out.println("String are same");
        }
        if (myStr.contains("World")) {
            System.out.println("String contains world");
        }
    }

    public static void printInformation(String string) {
        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is Blank");
            return;
        }
        int length = string.length();
        System.out.printf("Length: %d\n", length);
        char charAtIdx = string.charAt(0);
        System.out.printf("First Char of String %c%n", charAtIdx);
        System.out.printf("Last Char of String %c%n", string.charAt(length - 1));

    }
}
