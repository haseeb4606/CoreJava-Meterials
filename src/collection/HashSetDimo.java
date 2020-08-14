package collection;

import java.util.*;

public class HashSetDimo {

	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();
		
		h.add("Nawid");
		h.add("Sboor");
		h.add("A");
		h.add("B");
		h.add("D");
		h.add("C");
		h.add(null);
		
		System.out.println(h.add(null)); // false: because duplicates are not allowed and insortion is not preserved.
		System.out.println(h);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
