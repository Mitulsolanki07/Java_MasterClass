package ComputerFactory;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean value) {
        hasWorkToDo = value;
    }

    public void brewCoffee() {
        if (isHasWorkToDo()) {
            System.out.println("Brewing Coffee");
            setHasWorkToDo(false);
        }
    }

}
