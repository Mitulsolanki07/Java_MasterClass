package LoopExercise;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("Sum of Digit: " + sumDigits(193));
        System.out.println("Sum of Digit: " + sumDigits(-2002));
        System.out.println("Sum of Digit: " + sumDigits(2));
        switchCase(2);
        String myStr = new String("Mitul");
        String mySec = "Solanki";
        System.out.println("myStr: " + myStr + "mySec " + mySec);
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }
        return sum;
    }

    public static void switchCase(int value) {
        switch (value) {
            case 1:
                int i = 10;
                System.out.println("1");
                break;
            case 2:
                i = 2;
                System.out.println("i " + i);
                break;
            default:
                i = value;
                System.out.println(i);
                break;

        }
    }
}
