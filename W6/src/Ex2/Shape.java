package Ex2;

public class Shape {
	private String color;
	private boolean filled;
	
	// Constructors
	public Shape(){
		color = "green";
		filled = true;
	}
	public Shape (String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	// Getter color
	public String getColor() {
		return color;
	}
	
	// Setter color
	public void setColor(String color) {
		this.color = color;
	}
	
	// Getter filled
	public boolean isFilled() {
		if (filled==true){
			return true;
		} else{
			return false;
		}
	}
	
	// Setter filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		String toString = "";
		if(isFilled() == false){
			toString = "not";
		} return "A Shape with color of " +color +" and is " +toString +"filled.";
	}

}
