package task.tax;

public class Payment {
    private boolean isCost;
    private double value;
    private double vat;
    private String name;

    public Payment(boolean isCost, double value, double vat, String name) {
        this.isCost = isCost;
        this.value = value;
        this.vat = vat;
        this.name = name;
    }


    public boolean isCost() {
        return isCost;
    }

    public void setCost(boolean cost) {
        isCost = cost;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
