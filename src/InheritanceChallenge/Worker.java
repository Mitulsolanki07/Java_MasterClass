package InheritanceChallenge;

import javax.print.attribute.IntegerSyntax;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker() {

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public int getAge() {
//        Assume birthDate is in this format MM/DD/YYYY in string
        int currentYear = 2024;
        try {
            int birthYear = Integer.parseInt(birthDate.substring(6));
            return currentYear - birthYear;
        } catch (NumberFormatException e) {
            System.out.println("Exception occur" + e);
            return -1;
        }
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }
}
