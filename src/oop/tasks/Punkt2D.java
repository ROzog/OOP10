package oop.tasks;

public class Punkt2D {
    private int y;
    private int x;

    public Punkt2D() {
        this.y = 0;
        this.x = 0;
    }

    public Punkt2D(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getDistance(Punkt2D punkt2D){
        return Math.sqrt(Math.pow(getX() - punkt2D.getX(), 2) + Math.pow(getY() - punkt2D.getY(), 2));
    }
}
