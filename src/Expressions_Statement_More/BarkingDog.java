package Expressions_Statement_More;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println("isNeed to wake up: " + shouldWakeUp(true, 2));
        System.out.println("isNeed to wake up: " + shouldWakeUp(false, 5));
        System.out.println("isNeed to wake up: " + shouldWakeUp(true, -1));
        System.out.println("isNeed to wake up: " + shouldWakeUp(true, 8));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hrOfDay) {
        return ((hrOfDay < 8 && hrOfDay >= 0) || (hrOfDay > 22 && hrOfDay <= 23)) && isBarking;
    }
}
