package grandmother;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> linesFromFile = null;
        try {
             linesFromFile = Files.readAllLines(Paths.get("C:\\ak\\shoppingList.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            linesFromFile = new ArrayList<>();
        }

        List<Product> productList = new ArrayList<>();
        for (String s : linesFromFile) {
             //jabłka:30:1,20
             String[] someData = s.split(":");
             //[jabłka], [30], [1,20]

             productList.add(new Product(
                            someData[0],
                            Integer.parseInt(someData[1]),
                            Double.parseDouble(someData[2])));
        }
        ////////////////////////////////////////////////////////

        float sumOfCost = 0;
        for (Product product : productList) {
             sumOfCost += product.getCount() * product.getPrice();
        }
        System.out.println(sumOfCost);
    }
}
