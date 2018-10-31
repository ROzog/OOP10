package oop.company;

public class Manager extends Worker{
    private int salary;

    public Manager(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }


    @Override
    public void shout() {
        System.out.println("Do pracy kurcze rodacy bo mam prowizje od Was :)");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
