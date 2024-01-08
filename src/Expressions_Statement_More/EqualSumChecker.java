package Expressions_Statement_More;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println("A + B == C :" + hasEqualSum(1, 1, 1));
        System.out.println("A + B == C : " + hasEqualSum(1, 1, 2));
        System.out.println("A + B == C : " + hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int numA, int numB, int numC) {
        return (numA + numB) == numC;
    }
}
