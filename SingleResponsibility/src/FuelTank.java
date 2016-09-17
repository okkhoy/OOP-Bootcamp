
public class FuelTank implements FuelTankInterface, FuelSupplier {

    private int fuelLevel;
    
    public FuelTank(int initialFuelLevel) {
        fuelLevel = initialFuelLevel;
    }
    
    @Override
    public int checkFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void fillUp(int amount) {
        fuelLevel += amount;
    }

    @Override
    public void useFuel(int amount) {
        fuelLevel -= amount;
        if (fuelLevel < 0){
            fuelLevel = 0;
            throw new OutOfFuelException();
        }
    }

    
}
