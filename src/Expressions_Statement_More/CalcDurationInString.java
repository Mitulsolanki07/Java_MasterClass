package Expressions_Statement_More;

public class CalcDurationInString {
    public static void main(String[] args) {
        System.out.println("HH:MM:SS => " + getDurationString(3945));
        System.out.println("HH:MM:SS => " + getDurationString(65, 45));
    }

    //    seconds and minutes challenge
    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            return getDurationString(minutes, seconds % 60);
        }
        return "Minutes must be greater then zero & seconds cannot be negative or greater then 59";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hour = minutes / 60;
            int remainMin = minutes % 60;
            int remainSec = seconds % 60;
            return hour + "h " + remainMin + "m " + remainSec + "s ";
        }
        return "Minutes must be greater then zero & seconds cannot be negative or greater then 59";
    }
}
