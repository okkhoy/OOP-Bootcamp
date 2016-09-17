public class Driver {
    Radio radio = new Radio();
    Car car = new Car();

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
        car.accelerate();
    }

    public void slowDown(){
        car.decelerate();
    }
}
