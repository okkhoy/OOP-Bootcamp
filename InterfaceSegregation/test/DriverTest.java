import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DriverTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void shouldDecreaseFuelWhenGoingForDrive() {
        Car car = new Car(5);
        Driver driver = new Driver(car);

        driver.drive();

        assertThat(car.checkFuelLevel(), is(4));
    }

    @Test
    public void shouldDecreaseFuelBy5WhenGoingForLongDrive() {
        Car car = new Car(7);
        Driver driver = new Driver(car);

        driver.goForLongDrive();

        assertThat(car.checkFuelLevel(), is(2));
    }

    @Test
    public void shouldThrowOutOfFuelIfDrivingOnEmpty() {
        Car car = new Car(0);
        Driver driver = new Driver(car);

        thrown.expect(OutOfFuelException.class);
        driver.drive();
    }

    @Test
    public void shouldThrowNotEnoughFuelIfGoingForLongDrivingWithoutEnough() {
        Car car = new Car(3);
        Driver driver = new Driver(car);

        thrown.expect(NotEnoughFuelException.class);
        driver.goForLongDrive();
    }
}
