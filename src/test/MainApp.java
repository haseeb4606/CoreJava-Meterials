package test;

public class MainApp {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setFirstName("Hasib");
		emp.setLastName("Haidary");
		emp.setId(1001);
		emp.setDepartment("Finance");
		
		Address add = new Address();
		add.setCity("Charlottesville");
		add.setCountry("USA");
		add.setStreetName("Yellowstone Dr");
		add.setStreetNo(177);
		add.setZipcode(22903);
		
		emp.setAddress(add);
		
		CourierService cs = new CourierService();
		
		cs.deliverproduct(emp);
		
		
		
		

	}

}
