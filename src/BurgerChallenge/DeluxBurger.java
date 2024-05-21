package BurgerChallenge;

class DeluxBurger extends Burger {
    private Item deluxe1;
    private Item deluxe2;

    public DeluxBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String deluxe1, String deluxe2) {
        super.addToppings(extra1, extra2, extra3);
        this.deluxe1 = new Item(deluxe1, "TOPPING", 0);
        this.deluxe2 = new Item(deluxe2, "TOPPING", 0);
    }

    @Override
    public double getExtraPrice(String type) {
        return 0;
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }
}