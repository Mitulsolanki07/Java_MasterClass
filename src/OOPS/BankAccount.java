package OOPS;

public class BankAccount {
    private String AccountNumber;
    private double AccountBalance;
    private String CustomerName;
    private String CustomerEmail;

    private String PhoneNumber;

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void DepositFunds(double Amount) {
        if (Amount > 0) {
            this.AccountBalance += Amount;
            System.out.println(" Deposit Amount $ " + Amount + " your new Amount $ " + this.AccountBalance);
        } else {
            System.out.println("Non-Depositable Amount, Please provide valid amount!");
        }
    }

    public void WithdrawFunds(double Amount) {
        if (Amount <= 0) {
            System.out.println("Invalid Withdrawal Amount Requested!");
        } else if (this.AccountBalance > Amount) {
            AccountBalance -= Amount;
            System.out.println(" Withdrawal Amount $ " + Amount + " your new Account Balance Amount $ " + AccountBalance);
        } else {
            System.out.println("Requested Amount not available " + Amount + " is not Available in your Account " + AccountBalance + ", Please Deposit Funds First!");
        }
    }

    public void showAccountDetails() {
        System.out.println("AccountNumber " + AccountNumber + ", Customer Name " + CustomerName + ", Account Balance " + AccountBalance + ", Email " + CustomerEmail + ", Phone Number " + PhoneNumber);
    }
}
