package task.lottery.first;

import java.util.Random;

public class Lottery {
    private String[] playersNames;
    private String lotteryName;
    private Random random;

    public Lottery(String[] playersNames, String lotteryName) {
        this.playersNames = playersNames;
        this.lotteryName = lotteryName;
        this.random = new Random();
    }


    public String getRandomWinner(){
        return playersNames[random.nextInt(playersNames.length)];
    }

}
