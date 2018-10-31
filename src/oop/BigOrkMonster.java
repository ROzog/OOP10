package oop;

public class BigOrkMonster extends OrcMonster {
    public BigOrkMonster(int def) {
        super(def + 1000,  1500);
    }


    @Override
    public void attack() {
        System.out.println("big monsterowy atak");
    }
}
