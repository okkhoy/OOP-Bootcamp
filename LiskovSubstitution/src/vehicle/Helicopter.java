package vehicle;

/**
 * Created by stephandowding on 18/8/15.
 */
public class Helicopter extends BaseVehicle {

    protected int maxSpeed(){
        return 250;
    }

    private boolean takenOff = false;

    public void takeOff() {
        takenOff = true;
    }

    public void land() {
        if (getSpeed() > 0) { throw new RuntimeException("Cannot land while moving!"); }
        takenOff = false;
    }

    @Override
    public void accelerate() {
        if (!takenOff) { throw new RuntimeException("Can only accelerate once Taken Off."); }
        super.accelerate();
    }
}
