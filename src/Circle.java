
public class Circle extends Shape {
	
	
	double radious;
	
	public Circle(String Color, double CircleColor) {
		
		super(Color);
		
		this.radious=CircleColor;
		
	}
	
	

	double area() {
		return Math.PI * Math.pow(radious, 2);
	}
	
	

     public String toString() {
		
		return "Circle color is" + super.color+" the area of circle is:"+area();
	}
	
	
	
	public static void main(String[] args) {
		
		Circle obj = new Circle("Red", 4);
		System.out.println(obj);

	}
	
	
	
}
