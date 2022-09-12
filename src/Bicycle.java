public abstract class Bicycle extends Transport {

    public String modelName;
    public int wheelCount;

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }
    @Override
    public void transportService() {
        updateTyre();
    }
}
