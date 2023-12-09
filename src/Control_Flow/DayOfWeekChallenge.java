package Control_Flow;

public class DayOfWeekChallenge {
    public static void main(String[] args) {
        System.out.println("using enhanced switch block ");
        int day = 5;
        System.out.println(day + " => " + printDayOfWeek(day));
        day = 7;
        System.out.println(day + " => " + printDayOfWeek(day));
        System.out.println("using if else if else code block");
        day = 4;
        System.out.println(day + " => " + printWeekDay(day));
        day = 7;
        System.out.println(day + " => " + printWeekDay(day));
    }

    public static String printDayOfWeek(int day) {
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
    }

    public static String printWeekDay(int day) {
        if (day == 0) return "Sunday";
        else if (day == 1) return "Monday";
        else if (day == 2) return "Tuesday";
        else if (day == 3) return "Wednesday";
        else if (day == 4) return "Thursday";
        else if (day == 5) return "Friday";
        else if (day == 6) return "Saturday";
        else return "Invalid day";
    }
}
