package oop;

public class Starter {
    public static void main(String[] args) {
        OrcMonster orcMonster = new OrcMonster(10, 10);
        orcMonster.attack();
        orcMonster.throwThumb();


        BigOrkMonster bigOrkMonster = new BigOrkMonster(100);
        System.out.println(bigOrkMonster.getAttack());
    }
}
