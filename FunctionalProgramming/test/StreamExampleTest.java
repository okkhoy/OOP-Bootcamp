import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StreamExampleTest {

	@Test
	public void multiplyByTwoWithForLoop_shouldReturnListWithElementsTrimmed() {
		List<Integer> myList = Arrays.asList(1, 2, 3, 4);
		StreamExample example = new StreamExample();
		List<Integer> newList = example.multiplyByTwoWithForLoop(myList);
		assertEquals(Arrays.asList(2, 4, 6, 8), newList);
		assertEquals(Arrays.asList(2, 4, 6, 8), myList);
	}
	

	@Test
	public void multiplyByTwoWithStream_shouldReturnListWithElementsTrimmed() {
		List<Integer> myList = Arrays.asList(1, 2, 3, 4);
		StreamExample example = new StreamExample();
		List<Integer> newList = example.multiplyByTwoWithStream(myList);
		assertEquals(Arrays.asList(2, 4, 6, 8), newList);
	}

}
