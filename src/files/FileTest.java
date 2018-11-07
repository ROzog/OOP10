package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\ak\\asd.txt");

        try {
            Files.write(file.toPath(), "Hello world\r\n".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("hello\nHello :)"); //nowa linia
        System.out.println("hello\r\nHello :)"); //nowa linia w notatniku windows

    }
}
