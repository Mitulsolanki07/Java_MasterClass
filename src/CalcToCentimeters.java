import java.text.MessageFormat;

public class CalcToCentimeters {
    public static void main(String[] args) {
        System.out.println(MessageFormat.format("5 Feet , 8 Inch => {0} Cm", convertToCentimeters(6, 0)));
        System.out.println(MessageFormat.format("68 inch => {0} cm", convertToCentimeters(68)));
    }

    //    convert feet to inch,  inch to centimeters
    public static double convertToCentimeters(int inch) {
        return (2.54 * inch);
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12) + inches);
    }
}
