
public class Engine implements EngineInterface {
    
    private int rpm;
    private FuelSupplier fuelTank;

    public Engine(FuelSupplier fuelTank) {
        this.fuelTank = fuelTank;
    }
    
    @Override
    public int checkRPM() {
        return rpm;
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
        fuelTank.useFuel(amount);
    }
}
