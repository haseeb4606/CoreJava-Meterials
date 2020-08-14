
public class Rectingle extends Shape {
	
	double length;
	double width;
	
	public Rectingle(String shapColor, double RecLenght, double RecWidth) {
		
		super(shapColor);
		this.length=RecLenght;
		this.width=RecWidth;
		
		
	}
	
		public double area() {
			
			return length*width;
			
		}
	
	
		public String toString() {
			
			return "Rectangel color is" + super.color + "and the Rectangle are is: "+area();
		}
		
		

	public static void main(String[] args) {
		
		Rectingle obj = new Rectingle("White", 10, 5);
		
		System.out.println(obj);

	}

}
