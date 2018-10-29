package task.car;

public class Starter {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.capacity = 1200;
        engine.kind = "diesel";
        engine.name = "DCI";

        Tires tires = new Tires();
        tires.isSummerOption = false;
        tires.model = "FromChina123";

        Car car = new Car();
        car.brand  = "Ford";
        car.model = "Focus";
        car.engine = engine;
        car.tires  = tires;


        //nazwa opon samochodu
        System.out.println(car.tires.model);
        //pojemnosc silnika
        System.out.println(car.engine.capacity);
    }
}
