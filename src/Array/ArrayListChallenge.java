package Array;

import java.util.*;

public class ArrayListChallenge {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> Items = new ArrayList<>();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            printActions();
            switch (Integer.parseInt(sc.nextLine())) {
                case 0 -> {
                    System.out.println("Quit");
                    flag = false;
                }
                case 1 -> {
                    ArrayListChallenge.InsertItem();
                }
                case 2 -> {
                    ArrayListChallenge.RemoveItem();
                }
                default -> flag = false;
            }
        }
    }

    public static void printActions() {
        String textBlock = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";
//        textblock removes trailing white spaces so add an extrac space after text block
        System.out.println(textBlock + " ");
    }

    public static void InsertItem() {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] UserInput = sc.nextLine().split(",");
//        Items.addAll();
        for (String element : UserInput) {
            element = element.trim();

            if (!Items.contains(element) && !element.isBlank()) {
                Items.add(element);
            } else {
                System.out.println("Remove duplicate & empty item from item list: " + element);
            }
        }
        ArrayListChallenge.printItem();
    }

    public static void RemoveItem() {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] UserInput = sc.nextLine().split(",");
        for (String element : UserInput) {
            element = element.trim();
            if (Items.contains(element) && (!element.isBlank())) {
                Items.remove(element);
            } else {
                System.out.println("Cannot Remove empty or not found item from item list: " + element);
            }
        }
        ArrayListChallenge.printItem();
    }

    public static void printItem() {
        Items.sort(Comparator.naturalOrder());
        System.out.println("-".repeat(20));
        System.out.println("Item List:          " + Items);
        System.out.println("-".repeat(20));
    }
}