public class Car {
    int fuelLevel;

    public Car(int intialFuelLevel){
        fuelLevel = intialFuelLevel;
    }

    public void drive() throws OutOfFuelException {
        if(fuelLevel <= 0) throw new OutOfFuelException();
        fuelLevel -= 1;
    }

    public void fillUpFuel() {
        fuelLevel = 10;
    }

    public int checkFuelLevel() {
        return fuelLevel;
    }
}
