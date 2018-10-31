package oop.company;

import oop.BigOrkMonster;

public class Starter {
    public static void main(String[] args) {
        Boss boss = new Boss("Oskar", "Polak", 30);
        Manager manager = new Manager("Alicja", "Z czarów", 32, 250);
        Worker worker = new Worker("Alek", "Debski", 19);


        Worker someWorker = boss;

        Boss againBoss = (Boss) someWorker;
        againBoss.shout();

        printSomeSalary(boss);
        printSomeSalary(manager);

        Worker[] workers = new Worker[5];
        workers[0] = boss;
        workers[1] = manager;
        workers[2] = worker;

        for (Worker worker1 : workers) {
            System.out.println(worker1.getName());
        }
    }

    public static void printSomeSalary(Manager manager){
        System.out.println(manager.getSalary());
    }
}
