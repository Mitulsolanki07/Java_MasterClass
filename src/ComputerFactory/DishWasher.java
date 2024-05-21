package ComputerFactory;

public class DishWasher {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean value) {
        hasWorkToDo = value;
    }

    public void doDishes() {
        if (isHasWorkToDo()) {
            System.out.println("Washing Dishes");
            setHasWorkToDo(false);
        }
    }
}
