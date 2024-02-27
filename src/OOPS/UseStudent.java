package OOPS;

public class UseStudent {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("SSC00" + i, switch (i) {
                case 1 -> "Mitul";
                case 2 -> "Karan";
                case 3 -> "Nile-sh";
                case 4 -> "Suresh";
                case 5 -> "Ni men";
                default -> "Anonymous";
            }, "10/08/2002", "Java Masterclass");
            System.out.println(s);
        }
        LPAStudent recordStudent = new LPAStudent("SSC007", "retina", "10/01/2002", "Java MasterClass Series");
        Student POJOStudent = new Student("SSC008", "Pojo", "10/01/2002", "Java MasterClass Series");
        System.out.println(recordStudent);
        System.out.println(POJOStudent);
    }
}
