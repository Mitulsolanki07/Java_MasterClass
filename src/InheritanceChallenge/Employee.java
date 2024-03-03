package InheritanceChallenge;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public static int employeeNumber = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    public Employee() {
        this("Titu", "01/01/2001", "01/01/2024");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
