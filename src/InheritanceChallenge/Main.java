package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee mitul = new Employee("Mitul", "10/08/2002", "21/01/2023");
        System.out.println(mitul);
        System.out.println("Age: " + mitul.getAge());
        System.out.println("Pay: " + mitul.collectPay());

        SalariedEmployee karan = new SalariedEmployee("Karan", "19/03/2005", "01/01/2025", 32800);
        System.out.println(karan);
        System.out.println("Age: " + karan.getAge());
        System.out.println("Karan Paycheck $=" + karan.collectPay());
        karan.retire();
        System.out.println("Karan Pension check $=" + karan.collectPay());

        HourlyEmployee Emmie = new HourlyEmployee("Emmie", "29/06/2001", "01/01/2023", 15);
        System.out.println(Emmie);
        System.out.println("Age: " + Emmie.getAge());
        System.out.println("Emmie Paycheck $=" + Emmie.collectPay());
        System.out.println("Emmie Double Pay check $=\"" + Emmie.getDoublePay() + "\"");
        System.out.println("""
                Print Hello world
                    \u2022Indentation
                        \u2022SubIndentation
                """);
        System.out.println();
        System.out.println("Print Hello World\n\t Indentation\n\t\t SubIndentation");

        String formattedString = String.format("You age is %d", Emmie.getAge());
        System.out.println(formattedString);
        System.out.printf("You age is %.2f%n", (float) Emmie.getAge());
        for (int i = 1; i < 1000; i = i * 10) {
            System.out.printf("i is %4d%n", i);
        }
    }
}
