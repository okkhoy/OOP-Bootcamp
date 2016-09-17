
public interface DriverCarInterface {
    
    public void drive() throws OutOfFuelException ;
    
    public int checkFuelLevel() throws NotEnoughFuelException;
    
}
