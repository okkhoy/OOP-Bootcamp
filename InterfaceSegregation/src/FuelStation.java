public class FuelStation {

    public void fillUp(Car car){
        car.fillUpFuel();
    }

    public void fillUpIfLow(Car car){
        if(car.checkFuelLevel() < 5)
            car.fillUpFuel();
    }
}
