package oop;

public class Starter {
    public static void main(String[] args) {
        OrcMonster orcMonster = new OrcMonster(10, 10);
        OrcMonster orcMonster1 = new OrcMonster(10, 50);
        OrcMonster orcMonster2 = new OrcMonster(10, 33);

        BigOrkMonster bigOrkMonster = new BigOrkMonster(10);
        BigOrkMonster bigOrkMonster1 = new BigOrkMonster(10);
        BigOrkMonster bigOrkMonster2 = new BigOrkMonster(10);

        ElfMonster elfMonster = new ElfMonster(10, 14);
        ElfMonster elfMonster2 = new ElfMonster(10, 21);
        ElfMonster elfMonster3 = new ElfMonster(10, 23);

        Monster[] monsters = new Monster[9];

        monsters[0] = orcMonster;
        monsters[1] = orcMonster1;
        monsters[2] = orcMonster2;
        monsters[3] = bigOrkMonster;
        monsters[4] = bigOrkMonster2;
        monsters[5] = bigOrkMonster1;


        int sum = 0;
        for (Monster monster : monsters) {
            monster.attack();
            //sum += monster.getAttack();
        }


        if(Utils.isInternetConnected()){
            System.out.println("mam internet ;)");
        }
        System.out.println(sum / 6);



    }
}
