
public class ThisConcept {

	// Syntax 3rd example by using (THIS) calling a paramatirize constructor by help of nonparamtrize construcotr.
	
	String name;
	
	int id;

	ThisConcept(){
		
	name = "Hasib";
	
	id = 123;
	
		System.out.println("Student name = " +name+" "+ " and the id is = "+id);
	}

	
	ThisConcept(int a, int b){
		
		
		this();
		
		System.out.println("our addition result is = " +(a+b));
		
		
	}

	
	public static void main(String[] args) {
			
			
	ThisConcept obj = new ThisConcept(20, 50);
	
		
		
	}

}
