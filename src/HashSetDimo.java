import java.util.*;

public class HashSetDimo {

	public static void main(String[] args) {
		
		HashSet <String> hs = new HashSet <String>();
		
		hs.add("Zabi");
		hs.add("Sangar");
		hs.add("Sangar"); // it doesnt print the duplicate names
		
		
		Iterator<String> it = hs.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}	


// HashSet:
	// 1 - No duplicates are not allowed.
// 2 - HashSet store the element by using a mechanism called hashing 
// 3 - it contains unique element only 
// 4 - it allows null value
// 5 - HashSet class non synchronized


