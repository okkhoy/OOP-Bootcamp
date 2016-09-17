import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.assertThat;

public class FemaleBloppianTest {
    FemaleBloppian femaleBloppian = new FemaleBloppian();

    @Test
    public void shouldBeABloppian(){
        assertThat(femaleBloppian, isA(Bloppian.class));
    }

    @Test
    public void shouldBeAbleToFly(){
        assertThat(femaleBloppian.fly(), is("I just overtook concorde!"));
    }

    @Test
    public void shouldBeAbleToTalk(){
        assertThat(femaleBloppian.talk(), is("I am talking, can you hear me?"));
    }

    @Test
    public void shouldBeAbleToEat(){
        assertThat(femaleBloppian.eat(), is("mmm mm mmm, this is a tasty burger!"));
    }

    @Test
    public void shouldBeAbleToLayAnEgg(){
        assertThat(femaleBloppian.layEgg(), is("hmmm, which came first, the bloppian or the egg?"));
    }
}
