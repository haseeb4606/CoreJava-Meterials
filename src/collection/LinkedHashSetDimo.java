package collection;
import java.util.*;

public class LinkedHashSetDimo {
	
	// Discription: LinkedHashSet is the same as HashSet but the only diffrence is that we can preserved insortion order in LinkedHashSet.

	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet<String>();
		
		lh.add("Joh");
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("F");
		lh.add("D");
		
		System.out.println(lh);
		
		Iterator it = lh.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		lh.add("Dave");
		lh.add("Hasib");
		System.out.println(lh);

	}
	
	

}
