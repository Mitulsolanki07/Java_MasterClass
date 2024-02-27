package OOPS;

public class Calculator {
    public static void main(String[] args) {
        Floor floor = new Floor(2.5, 3.8);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(" Total Cost: " + calculator.getTotalCost());
    }

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
