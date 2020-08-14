
import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		
		
		List L = new LinkedList();
		
	
		
		
		L.add("Hasib");
		L.add("Jawad");
		L.add("Hamid");
		L.add("Samim");
		L.add("Hasib");
		
		System.out.println(L);
		
		System.out.println(L.get(1));
		System.out.println(L.remove(1));
		System.out.println(L);
		System.out.println(L.set(1, "Faroo"));
		System.out.println(L);
		
		List l = new LinkedList();
		
		l.add(12);
		l.add("Samim");
		l.add(125);
		
		L.addAll(1, l);
		System.out.println(l);
		
		if(l.equals("Zabi")) {
			
			System.out.println(l.set(0, "Jamal"));
		}
		
		else {
			System.out.println("no name matched, l list only contains "+l);
		}
		
		if(L.contains("Faroo")) {
			System.out.println(L.add("Monir"));
		}
		
		
	
		
	
	}
		
		
	
		
}

