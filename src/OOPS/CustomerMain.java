package OOPS;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("MitulSolanki", 35_000, "Mitul@xyz.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailId());
        Customer secCustomer = new Customer();
        System.out.println(secCustomer.getName());
        System.out.println(secCustomer.getCreditLimit());
        System.out.println(secCustomer.getEmailId());
    }
}
