package Control_Flow;

public class sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int num = 1; num <= 1000 && count < 5; num++) {
            if ((num % 3 == 0) || (num % 5 == 0)) {
                count += 1;
                sum += num;
            }
        }
        System.out.println("Sum of Number which are divisible by 3 or 5 is: " + sum);

        int j = 1;
        while (true) {
            j += 1;
            if (j % 3 == 0) {
                continue;
            } else {
                System.out.println("Value: " + j);
            }
            if (j > 100) {
                break;
            }
        }
    }
}
