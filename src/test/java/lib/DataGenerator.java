package lib;

import java.text.SimpleDateFormat;

public class DataGenerator {

    public static String getRandomEmail(){
        String timestamp = new SimpleDateFormat("yyyMMddHHmmss").format(new java.util.Date());
        return "learnqa" + timestamp + "@example.com";
    }
}