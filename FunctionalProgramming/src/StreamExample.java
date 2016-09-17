import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	
	public List<Integer> multiplyByTwoWithForLoop(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			int doubled = list.get(i) * 2;
			list.set(i, doubled);
		}
		return list;
	}
	
	public List<Integer> multiplyByTwoWithStream(List<Integer> list) {
		return list.stream() //create a stream (think of stream as an unfinished list)
				   .map((x) -> x * 2) //map: takes an element and transform it into something else
				   .collect(Collectors.toList()); //collect the stream elements back into a list
	}

}
