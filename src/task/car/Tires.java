package task.car;

public class Tires {
    private String model;
    private boolean isSummerOption;


    public Tires(String model, boolean isSummerOption) {
        this.model = model;
        this.isSummerOption = isSummerOption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSummerOption() {
        return isSummerOption;
    }

    public void setSummerOption(boolean summerOption) {
        isSummerOption = summerOption;
    }
}
