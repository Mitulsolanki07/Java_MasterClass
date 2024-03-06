package InheritanceChallenge;

public class StringMethods {
    public static void main(String[] args) {
        String birthYear = "10/01/2001";
        int length = birthYear.length();
        int startingIndex = birthYear.indexOf("2001");
        System.out.println(startingIndex);
        System.out.println(birthYear.substring(startingIndex, length));
        System.out.printf("Month: %s%n", birthYear.substring(3, 5));

        String newDate = String.join("/", "01", "01", "1999");
        System.out.println("newDate " + newDate);

        newDate = "02".concat("/");
        newDate = newDate.concat("01");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1998");
        System.out.println("newDate " + newDate);

        newDate = "03".concat("/").concat("01").concat("/").concat("1996");
        System.out.println("newDate " + newDate);

        System.out.println(newDate.replace("/", "-"));
        System.out.println("Hello World".replaceFirst("l", "T"));
        System.out.println("hello WORLD".equalsIgnoreCase("HeLLO WorLD"));
        System.out.println("Hello World".replaceAll("l", "T"));
        System.out.println("Hello World".startsWith("h"));
        System.out.println("Hello World".endsWith("d"));
        System.out.println("Hello World".repeat(2).repeat(2));
    }
}
