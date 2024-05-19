package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
