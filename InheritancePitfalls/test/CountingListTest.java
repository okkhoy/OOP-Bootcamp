import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountingListTest {

    @Test
    public void shouldReturnCorrectCounterForAddingASingleElement() {
        CountingList countingList = new CountingList();

        countingList.add("Batman");

        assertEquals(1, countingList.getCounter());
    }

    @Test
    public void shouldReturnCorrectCounterForAddingASingleElementMultipleTimes() {
        CountingList countingList = new CountingList();

        countingList.add("me");
        countingList.add("you");

        assertEquals(2, countingList.getCounter());
    }

    @Test
    public void shouldReturnCorrectCounterForAddingMultipleElements() {
        CountingList countingList = new CountingList();
        List<String> myList = Arrays.asList("Batman", "Robin");

        countingList.addAll(myList);
        //FIXME: Why did this unit test fail???
        assertEquals(2, countingList.getCounter());
    }

    @Test
    public void shouldReturnTheCorrectToStringFormat() {
        CountingList countingList = new CountingList();
        List<String> myList = Arrays.asList("Batman", "Robin");

        countingList.addAll(myList);

        //This unit test fails for the same reason as the one above.
        assertEquals("Added 2 elements: Batman, Robin", countingList.toString());
    }
}
