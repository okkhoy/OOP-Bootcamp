package shapes;

public class Triangle extends Shape {
	//Area = (b*h)/2
	
	private int base;
	private int height;
	
	public Triangle(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	public int getBase(){
		return base;
	}
	
	public int getHeight(){
		return height;
	}
}
