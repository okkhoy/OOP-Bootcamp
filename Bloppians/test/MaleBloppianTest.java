import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.assertThat;

/**
 * Created by stephandowding on 5/9/16.
 */
public class MaleBloppianTest {
    MaleBloppian maleBloppian = new MaleBloppian();

    @Test
    public void shouldBeABloppian(){
        assertThat(maleBloppian, isA(Bloppian.class));
    }

    @Test
    public void shouldBeAbleToFly(){
        assertThat(maleBloppian.fly(), is("I flew over the cuckoo's nest!"));
    }

    @Test
    public void shouldBeAbleToTalk(){
        assertThat(maleBloppian.talk(), is("I AM SHOUTING!!"));
    }

    @Test
    public void shouldBeAbleToEat(){
        assertThat(maleBloppian.eat(), is("mmm mm mmm, this is a tasty burger!"));
    }

    @Test
    public void shouleBeAbleToFertiliseAnEgg(){
        assertThat(maleBloppian.fertiliseEgg(), is("This egg is not for eating!!"));
    }
}
