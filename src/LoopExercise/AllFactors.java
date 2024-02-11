package LoopExercise;

public class AllFactors {
    public static void main(String[] args) {
        System.out.println("Factor for 6: ");
        printFactor(6);
        System.out.println("Factor for 10: ");
        printFactor(10);

    }

    public static void printFactor(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = number; i > 0; i--) {
            if ((number % i) == 0) {
                System.out.println(i);
            }
        }
    }
}
