package task.lottery.first;

public class Starter {
    public static void main(String[] args) {
        String[] names = {"Daniel", "Dawid", "Ilona", "Kacper"};
        Lottery lottery = new Lottery(names, "Grasz o 100000000 zł");


        System.out.println(lottery.getRandomWinner());
    }
}
