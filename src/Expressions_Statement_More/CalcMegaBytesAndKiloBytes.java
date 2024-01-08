package Expressions_Statement_More;

public class CalcMegaBytesAndKiloBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(2000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int iKB = kiloBytes % 1024;
            int iMB = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + iMB + " MB and " + iKB + " KB");
        }
    }
}
