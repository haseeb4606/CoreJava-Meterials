package test;

public class polymorphism2 extends polymorphism1 {

	
	public void showMe() {
		
		System.out.println("This is child class");
	}
	
	public static void main(String [] args) {
		
		polymorphism1 obj = new polymorphism2();  // this is the best example of PolymorPhism by calling refrece object of Parent class to child class 
		
		obj.showMe();
		
		
		
	}
	
}
