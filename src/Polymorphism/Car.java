package Polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
        System.out.println("Car -> Description :- " + description);
    }

    public void startEngine() {
        System.out.printf("Car -> Start  Engine  of type %s \n", this.getClass().getSimpleName());
    }

    public void drive() {
        this.runEngine();
    }

    protected void runEngine() {
        System.out.println("Car -> Run Engine " + this.getClass().getSimpleName() + " Engine");
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cyclinders = 6;

    public GasPoweredCar(String description, double avgKmPerLiter, int cyclinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cyclinders = cyclinders;
    }

    @Override
    public void startEngine() {
        System.out.println("GasPowerCar -> Start Engine with cylinders : " + this.cyclinders);
    }

    @Override
    protected void runEngine() {
        System.out.println("GasPowerCar -> Run Engine exceeds average " + this.avgKmPerLiter + " per liter");
    }
}

class Electric extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public Electric(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric EV -> Switch %d kWh battery on , Ready ! \n", this.batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("EV -> Usage is under average : %.2f \n", this.avgKmPerCharge);
    }
}

class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.\n ", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on , Ready!\n", this.batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average %.2f \n", this.avgKmPerLiter);
    }
}