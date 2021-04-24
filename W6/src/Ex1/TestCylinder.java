package Ex1;

public class TestCylinder {	// save as "TestCylinder.java"
	public static void main (String[] args) {
		// Declare and allocate a new instance of cylinder
        // with default color, radius, and height
		Cylinder c1 = new Cylinder(); 
		System.out.println("\n Cylinder 1 :\n"
				+ " radius=" + c1.getRadius()
				+ " height=" + c1.getHeight()
				+ " base area=" + c1.getArea()
				+ " volume=" + c1.getVolume()
				+ " \n " + c1.toString());	// Task 1.3

		// Declare and allocate a new instance of cylinder
        // specifying height, with default color, radius
		Cylinder c2 = new Cylinder(10.0); 
		System.out.println("\n Cylinder 2 :\n"
				+ " radius=" + c2.getRadius()
				+ " height=" + c2.getHeight()
				+ " base area=" + c2.getArea()
				+ " volume=" + c2.getVolume()
				+ " \n " + c2.toString());	// Task 1.3 

		// Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
		Cylinder c3 = new Cylinder(2.0, 10.0); 
		System.out.println("\n Cylinder 3 :\n"
				+ " radius=" + c3.getRadius()
				+ " height=" + c3.getHeight()
				+ " base area=" + c3.getArea()
				+ " volume=" + c3.getVolume()
				+ " \n " + c3.toString()); 	// Task 1.3
	}
}