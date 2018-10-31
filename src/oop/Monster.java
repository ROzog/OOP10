package oop;

public abstract class Monster {
    private int def;
    private int attack;

    public Monster(int def, int attack) {
        this.def = def;
        this.attack = attack;
    }


    public abstract void attack();

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
