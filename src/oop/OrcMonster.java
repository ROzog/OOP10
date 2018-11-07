package oop;

import java.util.List;
import java.util.Set;

public class OrcMonster extends Monster {
    public OrcMonster(int def, int attack) {
        super(def, attack);
    }

    
    @Override
    public void attack() {
        System.out.println("orkOWY atak!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
    }

    public void throwThumb(){
        System.out.println("rzuuuuuuuuuuuuuuucam!");
    }


}
