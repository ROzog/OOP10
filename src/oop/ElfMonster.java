package oop;

public class ElfMonster extends Monster {
    public ElfMonster(int def, int attack) {
        super(def, attack);
    }


    @Override
    public void attack() {
        System.out.println("elfowy atak");
    }

    public void letsFly(){
        System.out.println("jaaa latam");
    }
}
