package Control_Flow;

public class whileLoopChallenge {
    public static void main(String[] args) {
        int start = 5, stop = 20, countEvenNumber = 0, countOddNumber = 0;
        while (start <= stop) {
            start += 1;
            if (!isEvenNumber(start)) {
                countOddNumber += 1;
                continue;
            }
            System.out.println("Even number " + start);
            countEvenNumber += 1;
            if (countEvenNumber > 5) {
                System.out.println("Break out of loop, once 5 even numbers found");
                break;
            }

        }
        System.out.println("Odd Number " + countOddNumber + ", Even Number " + countEvenNumber);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
