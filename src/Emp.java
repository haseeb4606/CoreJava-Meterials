import java.util.*;
public class Emp {
	
	static String company;
	int numberOfEmployee;
	int id;
	String employee;
	
	
	public Emp( int n, int i, String e) {
		
		
		numberOfEmployee=n;
		id=i;
		employee=e;
		
	}
		
		public void myCompanyInfo() {
			
			System.out.println(company+" "+numberOfEmployee+" "+id+" "+employee);
			
		}
	
	public static void main(String[] args) {

			
			ArrayList ar = new ArrayList();
			
			ar.add("Hasib");
			ar.add("Nawid");
			ar.add("Nawab");
			ar.add("Hedayat");
			ar.set(1, "Jawad");
			
			System.out.println(ar);
			
			ListIterator it = ar.listIterator();
			
			if(ar.contains("Nawid")) {
				
				System.out.println("He received the first Grade in the Class");
			}
			
			
			}
			
			
			
			
		}



