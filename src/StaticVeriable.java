
public class StaticVeriable { 	
	
	 int rollNo;
	 
	 String name;
	 
	 static String collegeName = "MIT";
	 
	 StaticVeriable(int r, String n){
	 
	
	rollNo = r;
	
	name = n;
	
	
	
	 }
	 
	void display() {
		
		System.out.println(rollNo+"  "+name+"  "+collegeName);
		
		
	}
		public static void main(String[] args) {
			
			StaticVeriable s = new StaticVeriable(001, "Hasib");
			StaticVeriable s1 = new StaticVeriable(002, "Ahmad");
			StaticVeriable s2 = new StaticVeriable(003, "nabi");
			
			
		s.display();
		s1.display();		
		s2.display();
		
			
			
			
			
	}
	
}

