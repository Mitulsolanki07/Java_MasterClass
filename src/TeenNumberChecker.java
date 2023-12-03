public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println("Has teen : " + hasTeen(9, 99, 19));
        System.out.println("Has teen : " + hasTeen(23, 15, 42));
        System.out.println("Has teen : " + hasTeen(22, 23, 34));
    }

    //    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int num) {
        return (num >= 13 && num <= 19);
    }
}
