import shapes.*;

public class AreaSummer {
	public static double calculateTotalArea(Shape... shapes){
		double total = 0;
		
		for (Shape shape : shapes){
			total += shape.getArea();
		}
		
		return total;
	}
}
