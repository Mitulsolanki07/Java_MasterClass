package InheritanceChallenge;

public class StringBuilderVsString {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and GoodBye");
        StringBuilder helloBuilder = new StringBuilder("Hello" + " World");
        helloBuilder.append(" and GoodBye");
        printInformation(helloWorld);
        printInformation(helloBuilder);

        StringBuilder emptyBuilder = new StringBuilder();
        StringBuilder emptyBuilder32 = new StringBuilder(32);
        emptyBuilder.append("a".repeat(57));
        printInformation(emptyBuilder);
        emptyBuilder32.append("a".repeat(17));
        printInformation(emptyBuilder32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and GoodBye");
        builderPlus.deleteCharAt(16);
        builderPlus.insert(16, 'g');
        builderPlus.replace(20, 23, "Night");

        builderPlus.reverse().setLength(10);
        printInformation(builderPlus);


    }

    public static void printInformation(String string) {
        System.out.println("String " + string);
        System.out.println("Length " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String " + builder);
        System.out.println("Length " + builder.length());
        System.out.println("Capacity " + builder.capacity());

    }
}
