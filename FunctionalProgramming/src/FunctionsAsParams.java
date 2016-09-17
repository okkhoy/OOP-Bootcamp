import java.util.function.Function;

public class FunctionsAsParams {
	
	public String transformToString(int x, 
			Function<Integer, Integer> transformFunction) {
		
		int transformed = transformFunction.apply(x);
		
		return String.valueOf(transformed);
	}
	
	public String doubleUp(int x) {
		return transformToString(x, y -> y * 2);
	}
	
	public String tripleUp(int x) {
		return transformToString(x, y -> y * 3);
	}
	
	public String toBase2String(int x) {
		return transformToString(x, this::toBase2);
	}
	
	public int toBase2(int x) {
		return x % 2;
	}
	
}
