import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CarTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTopUpFuel() {
        Car car = new Car(5);
        car.fillUp(5);
        assertThat(car.checkFuelLevel(), is(10));
    }

    @Test
    public void shouldBeAbleToSpeedUp(){
        Car car = new Car(10);
        car.speedUp();
        assertThat(car.checkRPM(), is(1));
    }

    @Test
    public void shouldBeAbleToSlowDown(){
        Car car = new Car(10);
        car.speedUp();
        car.slowDown();
        assertThat(car.checkRPM(), is(0));
    }

    @Test
    public void speedUpAndSlowDownShouldUseFuel(){
        Car car = new Car(10);
        car.speedUp();
        car.speedUp();
        car.slowDown();
        car.slowDown();
        assertThat(car.checkFuelLevel(), is(6)); //1+2+1+0=4
    }

    @Test
    public void shouldThowOutOfFuelWhenFuelRunsOut(){
        Car car = new Car(1);
        car.speedUp();

        thrown.expect(OutOfFuelException.class);
        car.speedUp();
    }
}
