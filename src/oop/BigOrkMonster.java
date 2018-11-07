package oop;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BigOrkMonster extends OrcMonster {
    public BigOrkMonster(int def) {
        super(def + 1000,  1500);
    }


    @Override
    public void attack() {

        List<String> list = new ArrayList<>();


        System.out.println("big monsterowy atak");
    }
}
