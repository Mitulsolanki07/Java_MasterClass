package BurgerChallenge;

import java.util.Stack;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("Regular", "COKE", "Fries");
    }

    public MealOrder(String burgerName, String drinkName, String sideName) {
        if (burgerName.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxBurger(burgerName, 85);
        } else {
            this.burger = new Burger(burgerName, 30);
        }
        this.drink = new Item(drinkName, "drink", 20);
        this.side = new Item(sideName, "side", 10);
    }

    public double getTotalAmount() {
        if (this.burger instanceof DeluxBurger) {
            return this.burger.getAdjustedPrice();
        }
        return this.burger.getAdjustedPrice() + this.drink.getAdjustedPrice() + this.side.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        if (this.burger instanceof DeluxBurger) {
            Item.printItem(this.drink.getName(), 0);
            Item.printItem(this.side.getName(), 0);
        } else {
            side.printItem();
            drink.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE: ", getTotalAmount());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (this.burger instanceof DeluxBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            this.burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
