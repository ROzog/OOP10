package oop.company;

public class Director extends Manager {
    private int daysOffCount;

    public Director(String name, String surname, int age, int salary) {
        super(name, surname, age, salary + 500);
        daysOffCount = Integer.MAX_VALUE;
    }

    @Override
    public void shout() {
        System.out.println("oj beda zwolnienia w tym roku..");
    }

    public int getDaysOffCount() {
        return daysOffCount;
    }
}
