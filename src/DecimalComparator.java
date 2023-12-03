public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println("is Decimal Same : " + areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("is Decimal Same : " + areEqualByThreeDecimalPlaces(-3.1756, -3.176));
        System.out.println("is Decimal Same : " + areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("is Decimal Same : " + areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    //     it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = (int) (num1 * 1000);
        num2 = (int) (num2 * 1000);
        return num1 == num2;
    }
}
