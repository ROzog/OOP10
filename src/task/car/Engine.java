package task.car;

public class Engine {
    private String name;
    private int capacity;
    private String kind; //disel / petrol

    public Engine(String name, int capacity, String kind) {
        this.name = name;
        this.capacity = capacity;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
