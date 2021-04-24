package Ex2;

public class TestShape {
    public static void main (String[] args) {
    	// Circle class
    	Circle c = new Circle();
    	System.out.println("Circle :\n"
    					+ "radius = " + c.getRadius()
    					+ " perimeter = " + c.getPerimeter()
    					+ " area = " + c.getArea()
    					+ "\nnote = " +c.toString());
    			
    	// Rectangle class
    	Rectangle r = new Rectangle();
    	System.out.println("\nRectangle :\n"
    					+ "length = " + r.getLength()
    					+ " width = " + r.getWidth()
    					+ " perimeter = " + r.getPerimeter()
    					+ " area = " + r.getArea()
    					+ "\nnote = " + r.toString());
    			
    	// Square class
    	Square s = new Square();
    	System.out.println("\nSquare :\n"
    					+ "side = " + s.getSide()
    					+ " perimeter = " + s.getPerimeter()
    					+ " area = " + s.getArea()
    					+ "\nnote = " + s.toString());
    }
}
