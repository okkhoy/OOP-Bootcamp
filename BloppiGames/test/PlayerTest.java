import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import rules.AddEveryOtherRule;
import rules.AdditionRule;
import rules.GameRule;
import rules.MultiplicationRule;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    AdditionRule additionRule = new AdditionRule();
    AddEveryOtherRule addEveryOtherRule = new AddEveryOtherRule();
    MultiplicationRule multiplicationRule = new MultiplicationRule();

    @Test
    public void shouldPreferAddition(){
        Player player = new Player(new int[]{0,1,2});
        assertThat(player.findBest(
                new GameRule[]{additionRule, addEveryOtherRule, multiplicationRule}),
                is(additionRule));
    }

    @Test
    public void shouldPreferAddEveryOther(){
        Player player = new Player(new int[]{1,-1,2,-2,3,-3});
        assertThat(player.findBest(
                new GameRule[]{additionRule, addEveryOtherRule, multiplicationRule}),
                is(addEveryOtherRule));
    }

    @Test
    public void shouldPreferMultiplication(){
        Player player = new Player(new int[]{10,20,30});
        assertThat(player.findBest(
                new GameRule[]{additionRule, addEveryOtherRule, multiplicationRule}),
                is(multiplicationRule));
    }
}
