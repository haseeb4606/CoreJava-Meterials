 
import java.util.*;
public class MapDimo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap <Integer, String>();
		
		map.put(101, "Hasib");
		map.put(102, "Haidary");
		map.put(103, "Kamal");
		
		for(Map.Entry m: map.entrySet()){
			
			System.out.println(m);
		}
		
	
	}

}


//   1 - Map contains Values on the basis of Key that is Key and value pair, each key and value pair is known as an entry
//2  A map contains value keys.
//3 - A map contains unique keys.
//4 - A map is useful if you have to search, update or delete elements on the basis of key.
//5 - there are two interfaces for implementing map
	// 1st: map
 // 2nd: SortedMap
//Map has three classes 
	// 1st: HashMap
	// 2nd: LinkedHashMap
	// 3rd: TreeMap

//Extra note: A map doesn't allow duplicate keys but you can have duplicate values
//HashMap and LinkedHashMap allow nul keys and value, but TreeMap does not allow any nul key value 
//A map can be traversed so you need to convert it into set using KeySet(); and entrySet(); Methods.