package exceptions;

import com.sun.xml.internal.bind.api.impl.NameConverter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {


        int b = 0, a = 0;

        if(b == 0){
            throw new IllegalStateException();
        }

        System.out.println("1");

        try {
            openFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("alarm alarm alarm");
        } catch (IllegalArgumentException e){

        }

        System.out.println("2");
    }














    ///tego nie widzimy, bo jest np w jakims API czy bilbiotece//
    public static void openFile() throws IOException {

            Files.write(new File("D:\\someText.txt").toPath(),
                    "asd".getBytes(),
                    StandardOpenOption.APPEND);

    }
}
