package ComputerFactory;

public class Refrigerator {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean value) {
        hasWorkToDo = value;
    }

    public void orderFood() {
        if (isHasWorkToDo()) {
            System.out.println("Ordering Food");
            setHasWorkToDo(false);
        }
    }
}
