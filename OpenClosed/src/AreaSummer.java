import shapes.*;

public class AreaSummer {
	public static double calculateTotalArea(Shape... shapes){
		double total = 0;
		
		for (Shape shape : shapes){
			if (shape instanceof Square) {
				total += Math.pow(((Square) shape).getSideLength(), 2);
			}
			else if (shape instanceof Circle) {
				total += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
			}
		}
		
		return total;
	}
}
