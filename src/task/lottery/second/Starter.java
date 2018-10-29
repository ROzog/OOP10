package task.lottery.second;

public class Starter {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(10, "Grasz o 100000000 zł");
        lottery.addPlayer("Ilona");
        lottery.addPlayer("Kamil");
        lottery.addPlayer("Damian");
        lottery.addPlayer("Ktos");
        lottery.addPlayer("Nikt");

        System.out.println(lottery.getRandomWinner());
    }
}
