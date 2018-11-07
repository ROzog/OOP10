package oop;

public class GnomMonster extends Monster implements CanThrowSpell {
    public GnomMonster(int def, int attack) {
        super(def, attack);
    }

    @Override
    public void attack() {

    }

    @Override
    public void throwSpell() {
        System.out.println("rzuuuucam czaar");
    }
}
