public class Driver {
    private Radio radio = new Radio();
    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private Car car = new Car();

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
