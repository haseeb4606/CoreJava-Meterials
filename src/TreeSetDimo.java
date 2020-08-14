
import java.util.*;
public class TreeSetDimo {

	public static void main(String[] args) {


		TreeSet<String> tr = new TreeSet<String>();
		
		tr.add("john");
		tr.add("sam");
		tr.add("sam");
		
		
		
		Iterator<String> it = tr.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	
	//  2nd Example:
		
			tr.add("A");
			tr.add("B");
			tr.add("C");
			tr.add("D");
			tr.add("E");
			
			System.out.println("Intial Set"+tr);
			
			System.out.println("Reverse Set" + tr.descendingSet());
			System.out.println("Head set" +tr.headSet("C",true));
			System.out.println("sub set" +tr.subSet("A",false, "E",true));
			System.out.println("Tail set" + tr.tailSet("C",false));
	}

}

	