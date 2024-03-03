package OOPS;

public class Fish extends Animal{
    private int fins;
    private  int gills;

    public Fish(){
        this("GoldFish",30, 3,3);
    }
    public Fish(String type, double weight, int fins, int gills) {
        super(type, "Small", weight);
        this.fins = fins;
        this.gills = gills;
    }
    private void moveMuscles(){
        System.out.println("Muscles are moving");
    }
    private void moveBackfin(){
        System.out.println("backfin moving");
    }
    @Override
    public void move(String speed){
        super.move(speed);
        moveMuscles();
        if (speed == "Fast"){
            moveBackfin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
