package Expressions_Statement_More;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println("is Leap year: " + isLeapYear(-1600));
        System.out.println("is Leap year: " + isLeapYear(1600));
        System.out.println("is Leap year: " + isLeapYear(2017));
        System.out.println("is Leap year: " + isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {
//        given range
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
//                if divisible by 100 then it must be divisible by 400
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
//                if divisible by only 4, its leap year
                return true;
            }
            return false;
        }
        return false;
    }
}
