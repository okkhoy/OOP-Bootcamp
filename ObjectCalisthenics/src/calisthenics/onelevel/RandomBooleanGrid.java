package calisthenics.onelevel;

import java.util.Random;

/**
 * Created by thaodang on 17/8/15.
 */
public class RandomBooleanGrid {
    public static String[][] generate(int size) {
        String[][] seed = new String[size][size];
        Random random = new Random();
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                String cell = random.nextBoolean() ? "True" : "False";
                seed[row][column] = cell;
            }
        }
        return seed;
    }

}
