
public class StaticMethod {

	int id;
	String name;
	static String School="pvcc";

	public StaticMethod(int i, String n) {
		
		id = i;
		
		name = n;
		
		
	}
		
		 void display() {
			 
			
			
			 
			 System.out.println(id+"  "+name+" "+School);
			 
		}
		 
		 	static void get() {
		 		
		 		School = "UVA";
		 	}
 

	public static void main(String[] args) {
		
		StaticMethod obj = new StaticMethod(122, "Hasib");
		
		StaticMethod obj1 = new StaticMethod(252, "Jawid");
		StaticMethod obj3  = new StaticMethod(453, "Ahmad");
		get();
		obj.display();
		obj1.display();
		obj3.display();
		

	}

}
