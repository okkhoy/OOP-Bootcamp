import radio.BaseRadio;
import vehicle.BaseVehicle;

public class Driver {
    BaseRadio radio;
    BaseVehicle vehicle;

    public Driver(BaseRadio radio, BaseVehicle vehicle){
        this.radio = radio;
        this.vehicle = vehicle;
    }

    public void listenToRadio(){
        radio.turnOn();
    }

    public void listeningToFavouriteSong(){
        radio.turnUp();
    }

    public void talkingToPassenger(){
        radio.turnDown();
    }

    public void concentrate(){
        radio.turnOff();
    }

    public void speedUp(){
        vehicle.accelerate();
    }

    public void slowDown(){
        vehicle.decelerate();
    }
}
