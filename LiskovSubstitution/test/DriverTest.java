import org.junit.Before;
import org.junit.Test;
import radio.*;
import vehicle.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class DriverTest {

    BaseVehicle vehicle;
    BaseRadio radio;

    @Before
    public void setup() {
        vehicle = new Car();
        radio = new CheapRadio();
    }

    @Test
    public void shouldSpeedUp(){
        Driver driver = new Driver(radio, vehicle);
        driver.speedUp();

        assertThat(vehicle.getSpeed(), is(equalTo(1)));
    }

    @Test
    public void shouldSlowDown(){
        Driver driver = new Driver(radio, vehicle);
        driver.speedUp();

        driver.slowDown();

        assertThat(vehicle.getSpeed(), is(equalTo(0)));
    }

    @Test
    public void shouldTurnOnRadio(){
        Driver driver = new Driver(radio, vehicle);
        driver.listenToRadio();

        assertThat(radio.isTurnedOn(), is(true));
    }

    @Test
    public void shouldTurnOffRadioToConcentrate(){
        Driver driver = new Driver(radio, vehicle);
        driver.listenToRadio();
        driver.concentrate();

        assertThat(radio.isTurnedOn(), is(false));
    }

    @Test
    public void shouldTurnRadioUpWhenFavouriteSongComesOn(){
        Driver driver = new Driver(radio, vehicle);
        driver.listenToRadio();
        driver.listeningToFavouriteSong();

        assertThat(radio.getVolume(), is(equalTo(11)));
    }

    @Test
    public void shouldTurnRadioDownToTalkToPassenger(){
        Driver driver = new Driver(radio, vehicle);
        driver.listenToRadio();
        driver.talkingToPassenger();

        assertThat(radio.getVolume(), is(equalTo(9)));
    }
}
