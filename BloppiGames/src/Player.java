import rules.GameRule;

public class Player {
    private int[] values;

    public Player(int[] values){
        this.values = values;
    }

    // ***************
    // Fix this method
    public GameRule findBest(GameRule[] rules){
        return rules[0];
    }
}
