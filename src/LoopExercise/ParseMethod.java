package LoopExercise;

public class ParseMethod {
    public static void main(String[] args) {
        String currYear = "2024";
        String birthYear = "2002";
        int icurrYear = Integer.parseInt(currYear);
        int iBirthYear = Integer.parseInt(birthYear);
        System.out.println("My age is " + (icurrYear - iBirthYear));

        String myPartialAge = "21.5";
        double dPartialAge = Double.parseDouble(myPartialAge);
        System.out.println("My Age is " + dPartialAge);
    }
}
