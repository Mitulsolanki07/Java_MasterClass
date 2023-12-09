package Control_Flow;

public class switchStatement {
    public static void main(String[] args) {

        byte value = 127;
        callOldSwitch(value);
//        String month = "Mitul";
//        System.out.println(month +" Month is in " + getQuarter(month) + " Quarter");
    }

    public static int callOldSwitch(int value) {
        return switch (value) {
            case 0:
                int var = 1;
                yield var;
            case 1:
                System.out.println("1");
                yield value;
            case 2:
                System.out.println("2");
                yield value;
            case 3:
            case 4:
            case 5:
                System.out.println("it was 3 or 4 or 5");
                System.out.println("one more statement");
                yield value;
            case -128:
                System.out.println("it was -128");
                yield value;
            case 127:
                System.out.println("it was 127");
                yield value;
            default:
                System.out.println("was not 0,1, or 2");
                yield value;
        };
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st";

            case "Apr", "May", "Jun" -> "2nd";

            case "Jul", "Aug", "Sep" -> {
                yield "3rd";
            }

            case "Oct", "Nov", "Dec" -> "4th";
            default -> {
                String badResponse = month + " Invalid Quarter";
                yield badResponse;
            }
        };
//        return "";
    }

}
