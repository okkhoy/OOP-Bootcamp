import static org.hamcrest.core.Is.is;

public class MaleBloppian extends Bloppian {
    
    @Override
    public String talk() {
        return "I AM SHOUTING!!";
    }
    
    public String fertiliseEgg() {
        return "This egg is not for eating!!";
    }
}
