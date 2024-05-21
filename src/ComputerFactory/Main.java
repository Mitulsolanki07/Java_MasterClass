package ComputerFactory;

public class Main {
    public static void main(String[] args) {
        SmartKitchen mySmartKitchen = new SmartKitchen();
//        mySmartKitchen.getDishWasher().setHasWorkToDo(true);
//        mySmartKitchen.getDishWasher().doDishes();
//        mySmartKitchen.getIceBox().setHasWorkToDo(true);
//        mySmartKitchen.getIceBox().orderFood();
        mySmartKitchen.setKitchenState(true, true, true);
        mySmartKitchen.doKitchenWork();

        EnhancedPlayer player = new EnhancedPlayer("Mitul", 200, "Gun");
        System.out.println("Initial Health is " + player.healthRemaining());
        EnhancedPlayer player1 = new EnhancedPlayer("Karan");
        System.out.println("Initial Health is " + player1.healthRemaining());
        Printer printer = new Printer(50, true);
        System.out.println("initial pages count: " + printer.getPagesPrinted());
        System.out.printf("current job pages %d, printer total page: %d \n", printer.printPages(7), printer.getPagesPrinted());
        System.out.printf("current job pages %d, printer total page: %d \n", printer.printPages(4), printer.getPagesPrinted());
    }
}
