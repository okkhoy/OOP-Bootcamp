public class Car implements EngineInterface, FuelTankInterface {

    private int rpm = 0;
    private int fuelLevel;

    public Car(int initialFuelLevel){
        fuelLevel = initialFuelLevel;
    }

    @Override
    public void speedUp() {
        rpm += 1;
        useFuel(rpm);
    }

    @Override
    public void slowDown() {
        if (rpm ==  0) return;
        rpm -= 1;
        useFuel(rpm);
    }

    private void useFuel(int amount) {
        fuelLevel -= amount;
        if (fuelLevel < 0){
            fuelLevel = 0;
            throw new OutOfFuelException();
        }
    }

    @Override
    public int checkRPM() {
        return rpm;
    }

    @Override
    public int checkFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void fillUp(int amount) {
        fuelLevel += amount;
    }
}
