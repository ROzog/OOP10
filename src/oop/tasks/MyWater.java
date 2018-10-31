package oop.tasks;

public class MyWater {
    private static double SMALL_BOTTLE = 0.5;
    private static int MEDIUM_BOTTLE = 1.5;
    private static double BIG_BOTTLE = 2.5;

    private int countOfSmall;
    private int countOfMedium;
    private int countOfBig;

    public MyWater(int countOfSmall, int countOfMedium, int countOfBig) {
        countOfSmall = countOfSmall;
        countOfMedium = countOfMedium;
        countOfBig = countOfBig;
    }

    public void addSmallBottle(int howMany){
        countOfSmall = howMany;
    }

    public void addMediumBottle(int howMany){
        countOfMedium += howMany;
    }

    public void addBigBottle(int howMany){
        countOfBig += howMany;
    }

    //kod w galezi
    public double countAllWater(){
         return countOfSmall * BIG_BOTTLE
                 + countOfMedium * MEDIUM_BOTTLE
                 + countOfBig * BIG_BOTTLE;
    }
}
