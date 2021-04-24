package Ex2;

public class Square extends Rectangle {
	// Constructors
	public Square() {
		super();
	}
	public Square(double side) {
        super(side, side);
    }
	public Square(double side, String color, boolean filled) {
	    super(side, side, color, filled);
	}
	
	// Getter side
	public double getSide() {
        return super.getLength();
    }
	
	// Setter side
	public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

	public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

  	public double getArea(){
  		return getSide()*getSide();
  	}
  	
  	public double getPerimeter(){
  		return 4*getSide();
  	}
  	
  	@Override
  	public String toString(){
  		return "A Square with side = " + getSide()
  		+"\n       which is a subclass of " +super.toString();
  	}
}
