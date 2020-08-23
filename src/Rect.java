
public class Rect extends Shape{
	private final double width;
	private final double length;
	
	public Rect(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return width * length;
	}
	
	
}
