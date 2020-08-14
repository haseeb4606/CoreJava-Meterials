
public abstract class Shape {

	String color;
	abstract double area();
	
	public Shape(String Color) {
		this.color=Color;
		
	}
	
	String getColor() {
		return color;
	}

}
