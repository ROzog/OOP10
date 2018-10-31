package oop;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Utils {
    public static boolean isInternetConnected() {


        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://google.pl").openConnection();
            httpURLConnection.getResponseCode();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public boolean costam(){
        return isInternetConnected();
    }
}
