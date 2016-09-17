public class Car {

    private Engine engine;
    private FuelTank fuelTank;
    
    public Car(int initialFuelLevel){
        fuelTank = new FuelTank(initialFuelLevel);
        engine = new Engine(fuelTank);
    }

    public void speedUp() {
        engine.speedUp();
    }
    
    public void slowDown() {
        engine.slowDown();
    }

    public int checkRPM() {
        return engine.checkRPM();
    }    

    public int checkFuelLevel() {
        return fuelTank.checkFuelLevel();
    }

    public void fillUp(int amount) {
        fuelTank.fillUp(amount);
    }
}


