package rules;

public class AddEveryOtherRule implements GameRule {
    @Override
    public int calculateResult(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i += 2){
            sum += input[i];
        }
        return sum;
    }
}
