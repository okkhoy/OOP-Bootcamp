public class FuelStation {

    public void fillUp(FuelStationInterface car){
        car.fillUpFuel();
    }

    public void fillUpIfLow(FuelStationInterface car){
        if(car.checkFuelLevel() < 5)
            car.fillUpFuel();
    }
}
