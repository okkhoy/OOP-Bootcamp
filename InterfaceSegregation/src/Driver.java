public class Driver {
    private DriverCarInterface car;

    public Driver(DriverCarInterface car) {

        this.car = car;
    }

    public void drive() throws OutOfFuelException {
        car.drive();
    }

    public void goForLongDrive() throws NotEnoughFuelException {
        if (car.checkFuelLevel() < 5) throw new NotEnoughFuelException();
        for (int i = 0; i < 5; i+=1) car.drive();
    }
}
