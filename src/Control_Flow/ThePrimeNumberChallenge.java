package Control_Flow;

public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 10; num <= 50 && count < 3; num++) {
            boolean bIsPrime = isPrime(num);

            if (bIsPrime) {
                count += 1;
            }
            System.out.println(num + " is " + (bIsPrime ? "" : "Not a ") + " Prime Number");
        }
    }

    public static boolean isPrime(int wholeNumber) {
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
