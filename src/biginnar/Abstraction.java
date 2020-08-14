package biginnar;

public class Abstraction extends Dog {
	
	
	public Abstraction() {
		System.out.println("this is Abstraction construcot ");
	}
	
@Override
void catName() {
	// TODO Auto-generated method stub
	
}

@Override
void show() {
	System.out.println("I want to show you something");
	
}

	 void display(int b, int z) {
		 
		 System.out.println(b+z);
	 }
	 
	 void display() {
		 
		 System.out.println("HI");
	 }
	 
	public static void main(String[] args) {
		
		
		
		Dog obj = new Abstraction();
		
		obj.catName();
		obj.display();
		obj.display(10, 20);
		obj.show();

		
		

}
}