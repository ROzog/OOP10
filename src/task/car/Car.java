package task.car;


public class Car {
    private String model;
    private String brand;
    private Engine engine;
    private Tires tires;

    public Car(String model, String brand, Engine engine, Tires tires) {
        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.tires = tires;
    }

    public Car(String model, String brand, int capacity, boolean isWinterTires){
        this(model, brand, null, null);
        this.engine = new Engine("V6", capacity, "DISEL");
        this.tires = new Tires("CHINA", isWinterTires);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

       public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }
}
