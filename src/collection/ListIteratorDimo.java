package collection;
import java.util.*;

public class ListIteratorDimo {
	
	public static void main(String[] args) {
		
		LinkedList <String> l = new LinkedList <String>();
		l.add("Jamal");
		l.add("salam");
		l.add("Nawid");
		l.add("Hasib");
		//System.out.println(l);
		
		Iterator ltr = l.listIterator();
		
		while(ltr.hasNext()) {
			
			if(ltr.equals("Jamal")) {
				System.out.println(l);
				ltr.remove();
				break;
			}
			
			/*
			 * else if(ltr.equals("Hasib")) { ltr.add("Faye"); }
			 * 
			 * else if(ltr.equals("Nawid")) { ltr.set("Mahmood");
			 * 
			 * }
			 */			
		}
		
		System.out.println(l);

	}

}
