
public class Encapsulation1 {

	public static void main(String[] args) {

		 Encapsulation obj = new  Encapsulation();
		 
		obj.setAddress("Virginia");
		obj.setName("Hasib");
		obj.setSchoolName("PVCC");
		obj.setId(200);
		
		System.out.println(obj.getAddress());
		System.out.println(obj.getName());
		System.out.println(obj.getSchoolName());
		 System.out.println(obj.getId());
	}

}
