package task.car;

public class Starter {
    public static void main(String[] args) {
        Engine engine = new Engine("v6", 4000, "PETROL");
        Tires tires = new Tires("china", true);

        //dwa konstruktory
        Car car = new Car("Focus", "Ford", engine, tires);
        Car carNew = new Car("Focus", "Ford", 1200, true);

        carNew.getEngine().setCapacity(2000);
        carNew.setModel("dasdasdasd");



        //nazwa opon samochodu
        System.out.println(car.getTires().getModel());
        //pojemnosc silnika
        System.out.println(car.getEngine().getName());
    }
}
