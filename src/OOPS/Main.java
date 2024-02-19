package OOPS;

public class Main {
    public static void main(String[] args) {
//        Calculator Challenge
        CalculatorChallenge calculator = new CalculatorChallenge();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
//         Bank Account
        BankAccount bankAcc = new BankAccount();
//        BankAccount bankAcc = new BankAccount("09876A","Customer A","CustomerA@gmail.com","+91 7041 1234 59",100.0d);
//        bankAcc.setAccountNumber("09876A");
//        bankAcc.setAccountBalance(100.0d);
//        bankAcc.setCustomerEmail("CustomerA@gmail.com");
//        bankAcc.setCustomerName("Customer A");
//        bankAcc.setPhoneNumber("+91 7041 1234 59");
        bankAcc.showAccountDetails();
        bankAcc.DepositFunds(22500);
        bankAcc.showAccountDetails();
        bankAcc.WithdrawFunds(10500);
        bankAcc.showAccountDetails();
        bankAcc.WithdrawFunds(-100);
        bankAcc.showAccountDetails();
        bankAcc.DepositFunds(-1000);
        bankAcc.showAccountDetails();
        bankAcc.WithdrawFunds(30000);
        bankAcc.showAccountDetails();
//        Car Object
        Car car = new Car();
        car.setMake(null);
        car.setModel("A7");
        System.out.println("Make - " + car.getMake());
        System.out.println("model - " + car.getModel());
        car.describeCar();
    }
}
