package oop.tasks;

public class Starter {
    public static void main(String[] args) {
        Punkt2D punkt2D = new Punkt2D(1, 5);
        Punkt2D punktAnother = new Punkt2D(1, 5);


        System.out.println(punkt2D.getDistance(punktAnother));
    }
}
