public class Radio {

    public boolean isTurnedOn() {
        return hasPower;
    }

    public int getVolume() {
        return volume;
    }

    private boolean hasPower = false;
    private int volume = 10;

    public void turnOn() {
        hasPower = true;
    }

    public void turnOff() {
        hasPower = false;
    }

    public void turnUp() {
        if (hasPower) volume += 1;
    }

    public void turnDown() {
        if (hasPower) volume -= 1;
    }
}
