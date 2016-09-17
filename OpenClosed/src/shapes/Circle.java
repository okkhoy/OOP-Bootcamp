package shapes;

public class Circle extends Shape {
	// Area = pi*r^2
	
	private int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public int getRadius(){
		return radius;
	}
}
