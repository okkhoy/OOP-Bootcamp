import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

public class FuelStationTest {
    @Test
    public void shouldFillUpFuel() {
        FuelStation station = new FuelStation();

        Car car = new Car(3);
        station.fillUp(car);

        assertThat(car.checkFuelLevel(), is(10));
    }

    @Test
    public void shouldFillUpIfLow() {
        FuelStation station = new FuelStation();

        Car car = new Car(3);
        station.fillUpIfLow(car);

        assertThat(car.checkFuelLevel(), is(10));
    }

    @Test
    public void shouldNotFillUpIfNotLow() {
        FuelStation station = new FuelStation();

        Car car = new Car(7);
        station.fillUpIfLow(car);

        assertThat(car.checkFuelLevel(), is(7));
    }
}
