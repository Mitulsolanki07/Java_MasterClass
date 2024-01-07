package Control_Flow;

public class SumOdd {
    public static void main(String[] args) {
        int start = 1, end = 100;
        System.out.println("The sum of odd number range from " + start + " to " + end + ": " + sumOdd(start, end));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) {
            return -1;
        }
        int sumOdd = 0;
        for (start = start; start <= end; start++) {
            if (isOdd(start)) {
                sumOdd += start;
            }
        }
        return sumOdd;
    }
}
