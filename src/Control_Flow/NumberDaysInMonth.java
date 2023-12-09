package Control_Flow;

public class NumberDaysInMonth {
    public static void main(String[] args) {
        int year = -1600;
        System.out.println("is " + year + " Leap Year: " + isLeapYear(year));
        year = 1600;
        System.out.println("is " + year + " Leap Year: " + isLeapYear(year));
        year = 2017;
        System.out.println("is " + year + " Leap Year: " + isLeapYear(year));
        year = 2000;
        System.out.println("is " + year + " Leap Year: " + isLeapYear(year));
        int month = 1;
        year = 2020;
        System.out.println("In " + month + " month" + " have " + getDaysInMonth(month, year) + " days");

        month = 2;
        year = 2020;
        System.out.println("In " + month + " month" + " have " + getDaysInMonth(month, year) + " days");

        month = 2;
        year = 2018;
        System.out.println("In " + month + " month" + " have " + getDaysInMonth(month, year) + " days");

        month = -1;
        year = 2020;
        System.out.println("In " + month + " month" + " have " + getDaysInMonth(month, year) + " days");

        month = 1;
        year = -2020;
        System.out.println("In " + month + " month" + " have " + getDaysInMonth(month, year) + " days");
    }

    public static boolean isLeapYear(int year) {
        if (year < 0 || year > 9999) return false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            }
            return true;
        } else return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;

        boolean isLeapYear = isLeapYear(year);
        return switch (month) {
            case 1, 3 -> 31;
            case 2 -> {
                if (isLeapYear) yield 29;
                else yield 28;
            }
            default -> -1;
        };


    }
}
