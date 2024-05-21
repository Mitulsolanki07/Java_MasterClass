package ComputerFactory;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setIceBox(Refrigerator iceBox) {
        this.iceBox = iceBox;
    }


    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void setKitchenState(boolean brewMasterState, boolean dishWasherState, boolean iceBoxState) {
        brewMaster.setHasWorkToDo(brewMasterState);
        dishWasher.setHasWorkToDo(dishWasherState);
        iceBox.setHasWorkToDo(iceBoxState);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

    public void addWater() {

    }
}
