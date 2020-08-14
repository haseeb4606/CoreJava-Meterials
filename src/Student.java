 public class Student {

	 int id;
	 String firstName;
	 String lastName;
	 static String schoolName = "PVCC";
	 
	 Student(int i, String f, String l){
		 
		 id = i;
		 this.firstName = f;
		 this.lastName = l;
		 
		
	 }
	 
	 void show(int id, String firstName, String lastName) {
		 
		 this.id = id;
		 this.firstName = firstName;
		 this.lastName = lastName;
		 System.out.println(id+" "+firstName+" "+lastName+" "+schoolName);
		 
		 
	 }
	
	 
	 
	 public static void main(String[] args) {
	
		 
		Student obj = new Student(100, "Ahmad", "Jamil");
		obj.show(100, "Satar", "Kamal");
		obj.show(101, "Jamal", "Kabir");
		obj.show(301, "Nabil", "Karimi");
		
		
				
	 }
}
