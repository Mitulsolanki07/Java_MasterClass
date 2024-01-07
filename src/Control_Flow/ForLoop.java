package Control_Flow;

public class ForLoop {
    public static void main(String[] args) {
        for (double rate = 2.0; rate <= 5; rate++) {
            double InterestedAmount = calculateInterest(10_000, rate);
            System.out.println("10,000 at " + rate + "% interest = " + InterestedAmount);
        }
//        System.out.println("25,000 at 3% interest = " + calculateInterest(25_000, 3.0));
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

