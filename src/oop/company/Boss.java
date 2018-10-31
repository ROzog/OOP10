package oop.company;

public class Boss extends Director {
    public Boss(String name, String surname, int age) {
        super(name, surname, age, Integer.MAX_VALUE);
    }

    @Override
    public void shout() {
        System.out.println("Gorszy sort ludzi tak ma, ze nie wychodzi ponad 20 tys mc");
    }
}
