package task.lottery.second;

import java.util.Random;

public class Lottery {
    private String[] playersNames;
    private String lotteryName;
    private Random random;

    public Lottery(int playerMaxSize, String lotteryName) {
        this.playersNames = new String[playerMaxSize];
        this.lotteryName = lotteryName;
        this.random = new Random();
    }

    //metoda dodajaca gracza na pierwsze wolne miejsce w tablicy
    public void addPlayer(String player){
        for (int i = 0; i < playersNames.length; i++) {
            if(playersNames[i] == null){
                playersNames[i] = player;
                break;
            }
        }
    }

    public String getRandomWinner(){
        return playersNames[random.nextInt(playersNames.length)];
    }

}
