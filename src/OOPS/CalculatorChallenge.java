package OOPS;

public class CalculatorChallenge {
    private double firstNumber;
    private double secondNumber;

    // write code here
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double number) {
        firstNumber = number;
    }

    public void setSecondNumber(double number) {
        secondNumber = number;
    }

    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return (firstNumber / secondNumber);
    }

}