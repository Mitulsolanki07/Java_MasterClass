package OOPS;

import java.util.Locale;

public class Car {
    private String make = "Mercedes-Benz";
    private String model = "AMG E53";
    private String Color = "Black";

    private boolean isConvertible = true;
    private int doors = 2;

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return Color;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public int getDoors() {
        return doors;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        if (make == null) {
            make = "Unknown";
        }
        String lowerCase = make.toLowerCase();
        switch (lowerCase) {
            case "od", "mercedes", "tesla", "toyoto" -> this.make = make;
            default -> this.make = "Unsupported";
        }

    }

    public void setColor(String color) {
        Color = color;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void describeCar() {
        System.out.println(doors + " - doors " + make + " " + model + " " + Color + " " + (isConvertible ? "Convertible" : "Not Convertible"));
    }
}
