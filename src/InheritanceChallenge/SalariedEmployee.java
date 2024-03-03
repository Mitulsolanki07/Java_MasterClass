package InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public double collectPay() {
//        divide by 26 weeks to get biweekly salary
        double payCheck = (annualSalary / 26);
        double adjustSalary = isRetired ? 0.9 * payCheck : payCheck;
        return (int) adjustSalary;
    }

    public void retire() {
        terminate("01/01/2024");
        this.isRetired = true;
    }
}
