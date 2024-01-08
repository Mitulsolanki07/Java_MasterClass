package Expressions_Statement_More;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculate area of circle: " + area(5.0));
        System.out.println("Calculate area of circle: " + area(-1.0));
        System.out.println("Calculate area of rectangle: " + area(5.0, 4.0));
        System.out.println("Calculate area of rectangle: " + area(-1.0, 4.0));
    }

    public static double area(double radius) {
//        calculate area of circle
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
//        calculate area of rectangle
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}
