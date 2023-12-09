package Control_Flow;

public class NATOPhoneticAlphabet {
    public static void main(String[] args) {
        char translate = 'C';
        System.out.println(translate + " converted in Nato phonetic alphabet : " + getNatoPhoneticWord(translate));

    }

    public static String getNatoPhoneticWord(char translate) {
        return switch (translate) {
            case 'A':
                System.out.println("Hello World ");
                yield "Able";
            case 'B':
                yield "Baker";
            case 'C':
                yield "Charlie";
            case 'D':
                yield "Dog";
            case 'E':
                yield "Easy";
            default:
                yield "Invalid Character";

        };
    }
}
