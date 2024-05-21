package Polymorphism;

public class TestCarMain {
    public static void main(String[] args) {
        Car maruti = new Car("Maruti Suzuki 800");
        RunRace(maruti);
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        RunRace(ferrari);
        Car tesla = new Electric("2021 Red Tesla Model", 563, 75);
        RunRace(tesla);
        Car fourOd = new HybridCar("0000 D A7", 463, 55, 8);
        RunRace(fourOd);
    }

    public static void RunRace(Car car) {
        System.out.println("Car at Runtime type -> " + car.getClass().getSimpleName());
        car.drive();
    }
}
