package Expressions_Statement_More;

import java.text.MessageFormat;

public class CalcMinToYearAndDay {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    //    calculate days and year from minutes
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int year = (int) (minutes / 5_25_600);
            int days = (int) (minutes / 1440) % 365;
            System.out.println(MessageFormat.format("{0} min = {1} y and {2} d", minutes, year, days));
        }

    }
}
