package OOPS;

public class Customer {
    private String Name;
    private double CreditLimit;
    private String EmailId;

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailId() {
        return EmailId;
    }

    public Customer(String Name, double CreditLimit, String EmailId) {
        this.Name = Name;
        this.CreditLimit = CreditLimit;
        this.EmailId = EmailId;
        System.out.println("Three Args Constructor Called");
    }

    public Customer() {
        this("Default", 80_000, "XYZ@gmail.com");
        System.out.println("Empty Args Constructor Called");
    }

    public Customer(String Name, String EmailId) {
        this(Name, 10_000, EmailId);
        System.out.println("two Args Constructor Called");
    }
}
