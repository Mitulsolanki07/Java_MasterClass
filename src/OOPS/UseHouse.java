package OOPS;

public class UseHouse {
    public static void main(String[] args) {
        House blueHouse = new House("Blue");
//        create copy of object reference in memory i.e. same object which is reference by two variables name blueHouse, anotherHouse
        House anotherHouse = blueHouse;
        System.out.println(" Blue House reference " + blueHouse.getColor());
        System.out.println(" Another House reference " + anotherHouse.getColor());

        anotherHouse.setColor("Yellow");
        System.out.println(" Blue House reference " + blueHouse.getColor());
        System.out.println(" Another House reference " + anotherHouse.getColor());

        House greenHouse = new House("Green");
//         dereference anotherHouse from blueHouse and reference to greenHouse
        anotherHouse = greenHouse;

        System.out.println(" Blue House reference " + greenHouse.getColor());
        System.out.println(" Blue House reference " + blueHouse.getColor());
        System.out.println(" Another House reference " + anotherHouse.getColor());

        printHello();
        UseHouse.printHello();
    }

    public static void printHello() {
        System.out.println("Hello World");
    }
}
