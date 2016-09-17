public class Car {
    protected int speed = 0;

    public void accelerate() {
        speed += 1;
    }

    public void decelerate() {
        speed -= 1;
    }
    
    public int getSpeed(){
    	return speed;
    }
}
