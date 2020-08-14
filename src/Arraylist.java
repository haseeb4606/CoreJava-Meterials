

import java.util.ArrayList;

public class Arraylist {
	

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		// Adding object into the ArryaList.
		
				al.add("Hasib");
				al.add("Kamal");
				al.add("Sami");
				al.add("Hamid");
				al.add("Hasib");
				
			
			//	al.set(0, "jamila"); how to set the another element 
				
						
				//System.out.println(al);
						
				
			///	System.out.println(al.isEmpty()); shows if our array has something inside
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		// Adding elements of A
		
		
		al1.addAll(al);
		
		System.out.println(al1);
		
	}

	
}