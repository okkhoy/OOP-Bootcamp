import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BloppianTest {

    private Bloppian bloppian = new Bloppian();

    @Test
    public void shouldBeAbleToFly(){
        assertThat(bloppian.fly(), is("I flew over the cuckoo's nest!"));
    }

    @Test
    public void shouldBeAbleToTalk(){
        assertThat(bloppian.talk(), is("I am talking, can you hear me?"));
    }

    @Test
    public void shouldBeAbleToEat(){
        assertThat(bloppian.eat(), is("mmm mm mmm, this is a tasty burger!"));
    }
}
