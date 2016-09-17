import rules.GameRule;

public class Player {
    private int[] values;

    public Player(int[] values){
        this.values = values;
    }

    // ***************
    // Fix this method
    public GameRule findBest(GameRule[] rules){
        int bestValue = 0;
        GameRule bestRule = null;
        for (GameRule r : rules) {
            int tmpVal = r.calculateResult(values);
            if (tmpVal > bestValue) {
                bestValue = tmpVal;
                bestRule = r;
            }
        }       
        return bestRule;
    }
}
