package LoopExercise;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = ReverseNumber(number);
        int reverseLen = getDigitCount(reverseNumber);
        int NumOfDigit = getDigitCount(number);
        while (reverseNumber > 0) {
            System.out.println(getString(reverseNumber % 10));
            reverseNumber /= 10;
        }
        while (reverseLen < NumOfDigit) {
            System.out.println("Zero");
            NumOfDigit -= 1;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            // Log b ^ n = p i.e. log base raise to number n = power value p for instance log base 10 raise to 10000 = power value p 4 as 10(b) ^ 4(p) == 10000 (n)
            return (int) Math.log10(number) + 1;
        }

    }

    public static int ReverseNumber(int number) {
        int copyNum = number;
        int reverseNum = 0;
        while (copyNum > 0) {
            int remainder = copyNum % 10;
            reverseNum = reverseNum * 10 + remainder;
            copyNum /= 10;
        }
        return reverseNum;
    }

    public static String getString(int number) {
        return switch (number) {
            case 1 -> {
                yield "One";
            }
            case 2 -> {
                yield "Two";
            }
            case 3 -> {
                yield "Three";
            }
            case 4 -> {
                yield "Four";
            }
            case 5 -> {
                yield "Five";
            }
            case 6 -> {
                yield "Six";
            }
            case 7 -> {
                yield "Seven";
            }
            case 8 -> {
                yield "Eight";
            }
            case 9 -> {
                yield "Nine";
            }
            case 0 -> {
                yield "Zero";
            }
            default -> {
                yield "Invalid Value";
            }
        };
    }
}
