package oop.tasks.boxes;

public class Starter {
    public static void main(String[] args) {

        Box box = new Box(10); //10
        Box boxTwo = new Box(15);  //15

        //25 + 15 = 40
        Box hejo = box.joinDiagonal(boxTwo).joinHorizontally(boxTwo).joinVerticaly(boxTwo);
        System.out.println(hejo.getHeight());
    }
}
