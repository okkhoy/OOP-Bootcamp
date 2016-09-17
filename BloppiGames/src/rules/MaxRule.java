package rules;
import java.util.Arrays;

public class MaxRule implements GameRule {

    @Override
    public int calculateResult(int[] input) {
        int max = 0;
        for(int i: input) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}
