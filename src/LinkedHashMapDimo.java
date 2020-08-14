
import java.util.*;
public class LinkedHashMapDimo {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		
		lhm.putIfAbsent(100, "Kabibr");
		lhm.putIfAbsent(101, "Salam");
		lhm.putIfAbsent(102, "Jamil");
		lhm.putIfAbsent(103, "Sabawon");

		// Fetching Key:
		
		System.out.println("Keys: "+ lhm.keySet());
		
		//Fetching Values.
		
		System.out.println("Values: "+ lhm.values());
		
		// Fetching key-values pair.
		
		System.out.println("Key-value pairs: ");
		lhm.entrySet();
			


		
		
		
		

	}

}
