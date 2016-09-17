
public class SportsCar extends Car {
    
    @Override
    public void accelerate() {
        speed += 2;
    }

    @Override
    public void decelerate() {
        speed -= 2;
    }
}
