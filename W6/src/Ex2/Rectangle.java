package Ex2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	// Constructors
	public Rectangle() {
		super();
	    width = 1.0;
	    length = 1.0;
	}
	public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
	public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
	
	// Getter width
	public double getWidth() {
		return width;
	}
	
	// Setter width
	public void setWidth(double width) {
		this.width = width;
	}
	
	// Getter length
	public double getLength() {
		return length;
	}
	
	// Setter length
	public void setLength(double length) {
		this.length = length;
	}
	
	//return the area of rectangle
	public double getArea() {
		return length*width;
	}
	
	// return the perimeter of rectangle
	public double getPerimeter() {
		return length*2 + width*2;
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width = " + width
				+" and length = " + length
				+"\n       which is a subclass of " + super.toString();
	}
}
