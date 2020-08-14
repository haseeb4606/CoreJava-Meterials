package test;

public class CourierService {
	
	public void deliverproduct(Employee emp) {
		
		Address add = emp.getAddress();
		
		System.out.println("I am delivering to"+add.toString());
	}
	
	

}
