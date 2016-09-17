package rules;

import java.util.Arrays;

public class MultiplicationRule implements GameRule {
    @Override
    public int calculateResult(int[] input) {
        return Arrays.stream(input).reduce(1, (x, y) -> x * y);
    }
}
