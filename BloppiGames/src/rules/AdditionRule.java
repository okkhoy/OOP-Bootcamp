package rules;

import java.util.Arrays;

public class AdditionRule implements GameRule {
    @Override
    public int calculateResult(int[] input) {
        return Arrays.stream(input).reduce(0, (x, y) -> x + y);
    }
}
