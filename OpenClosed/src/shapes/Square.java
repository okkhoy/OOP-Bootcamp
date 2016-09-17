package shapes;

public class Square extends Shape {
	// Area = x^2
	
	private int sideLength;
	
	public Square(int sideLength){
		this.sideLength = sideLength;
	}
	
	public int getSideLength(){
		return sideLength;
	}

    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }
}
