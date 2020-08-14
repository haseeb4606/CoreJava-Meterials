
public class SuperB extends SuperA {
	
	String name = "School";
	
	void display() {
		
		 //1st Syntax example by using (super) we can call two simalare variable
		
		
		System.out.println(super.name);
		System.out.println(name);  
	}

	public static void main(String[] args) {

		SuperB obj = new SuperB();
		
		obj.display();
		
	}

}
