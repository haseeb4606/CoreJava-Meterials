import java.util.*;
public class HashMapDimo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Intial element of map " + hm);
		
		hm.put(100, "Hasib");
		hm.put(101, "Haidary");
		hm.put(102, "Nawab");
		hm.put(103, "Haid");
		hm.remove("Haid");
		hm.replaceAll((k,v)->"xyz");
		
		

		System.out.println("After invoking put method");
		for (Map.Entry m: hm.entrySet()){
			
			System.out.println(m.getKey() +"  "+m.getValue());
		
		}
		
		hm.putIfAbsent(98, "John");
		System.out.println("After invoking the putIfAbsent method");
		

		
		for(HashMap.Entry m: hm.entrySet()) {
			
			System.out.println(m.getKey() +"  "+m.getValue());
		}
		
		
		
		
	}

}

// Discription: it contains value based on the Key.
// 2 - HashMap contains only Unique keys.
// 3 - HashMap class may have one nul key and multiple nul values.
// 4 - HashMap is non synchronized and maintains no order.