
import java.util.*;
public class LinkedHashSetDimo {

	public static void main(String[] args) {

		
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		hs.add("Jawid");
		hs.add("Jawid");
		hs.add("Zahra");
		hs.add("Nawid");
		hs.add("nul");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

		// LinkedHashSet:
		
		// 1 - this class contains unique elements only
		 // 2 - this class provides all Set operation and allow "nul" element
		// 3 - this class is non synchronized 
		// 4 this class maintains insertion order
		//

		
		
		
		
		
		
		
	}

}
