import org.junit.Test;

import shapes.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class AreaSummerTest {

	@Test
	public void giveAreaOfSquareAndCircle(){
		Square square = new Square(2);//Area = 4
		Circle circle = new Circle(2);//Area = 12.57 ish
		
		double totalArea = 
				AreaSummer.calculateTotalArea(
						square, 
						circle);
		
		assertThat(totalArea, closeTo(16.57, 0.01));
	}
	
	@Test
	public void giveAreaOfSquareCircleAndRectanlge(){
		Square square = new Square(2);//Area = 4
		Circle circle = new Circle(2);//Area = 12.57 ish
		Rectangle rectangle = new Rectangle(2,3);//Area = 6
		
		double totalArea = 
				AreaSummer.calculateTotalArea(
						square, 
						circle,
						rectangle);
		
		assertThat(totalArea, closeTo(22.57, 0.01));
	}
	
	@Test
	public void giveAreaOfAllShapes(){
		Square square = new Square(2);//Area = 4
		Circle circle = new Circle(2);//Area = 12.57 ish
		Rectangle rectangle = new Rectangle(2,3);//Area = 6
		Triangle triangle = new Triangle(6,4);//Area = 12
		Trapezium trapezium = new Trapezium(6, 5, 3);//Area = 16.5
		
		double totalArea = 
				AreaSummer.calculateTotalArea(
						square, 
						circle,
						rectangle,
						triangle,
						trapezium);
		
		assertThat(totalArea, closeTo(51.07, 0.01));
	}
}
