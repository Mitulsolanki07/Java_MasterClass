package Expressions_Statement_More;

public class CalcMilesPerHour {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(-10.2);
        printConversion(10.52);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
