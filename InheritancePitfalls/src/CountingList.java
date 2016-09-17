import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is a famous Java example by Joshua Bloch to highlight the pitfalls of inheritance
 */
public class CountingList extends MyStringList {
    private int counter = 0;

    @Override
    public void add(String t) {
        super.add(t);
        counter ++;
    }

    @Override
    public void addAll(Collection<String> c) {
        super.addAll(c);
        counter += c.size();
    }

    public int getCounter() {
        return counter;
    }

    public String toString() {
        return String.format("Added %d elements: %s", counter, super.concatenateList(", "));
    }
}
