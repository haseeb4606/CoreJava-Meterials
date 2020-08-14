
public class MethodPractice {

	
	
	
	int id;
	
	int rollNumber;
	
	int pincode;
	
	 void employee(int i, int r, int p) {
		
		
		 id =i;
		 
		 rollNumber = r;
		 
		 pincode = p;
		 
		 System.out.println();
	 
	 }
	 
	 
	 void display() {
		 
		 System.out.println(id+" "+rollNumber+ " " + pincode);
	
	
	
	
	 }
	
	public static void main(String[] args) {

		
		
		MethodPractice obj = new MethodPractice(); 
		
		obj.employee(100, 101, 2010);
		obj.display();
		obj.employee(909,102, 20111);
		obj.display();
		obj.employee(902, 103, 20112);
		obj.display();
		obj.employee(113, 104, 20113);
		obj.display();
		obj.employee(2104, 105, 20114);
			 
			
			obj.display();
			
		}
		
		
		
		
		
		
		
		
		
		
	}


