package Ex2;

public class Circle extends Shape{
	private double radius;
	
	// Constructors
	public Circle() {
		super();
		radius = 1.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	// Getter radius
	public double getRadius() {
		return radius;
	}
	
	// Setter radius
	public void setRadius() {
		this.radius = radius;
	}
	
	// return the area of circle
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	// return the perimeter of circle
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	@Override
	public String toString() {
		return "A Circle with radius = " + radius
		         + "\n       which is a sublclass of " + super.toString();
	}
}
