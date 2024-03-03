package OOPS;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog() {
        this("Poodles",25,"Bat Ear","Curled Tail");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow"){
            Dog.walk();
            Dog.wagTail();
        }
        else{
            Dog.run();
            Dog.bark();
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf"){
            System.out.println("Ow oohoo oww");
        }
        Dog.bark();
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, (weight < 15) ? "low" : (weight <= 35) ? " Medium" : "Large", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
    public static void  bark(){
        System.out.println("Wooh Woof!");
    }
    public static void wagTail(){
        System.out.println("Dog Wag Tail!");
    }
    public static void walk(){
        System.out.println("Dog Walking");
    }
    public static void run(){
        System.out.println("Dog Running");
    }

    
}
