import java.util.*;

public class LiknkedLisDimo {

	public static void main(String[] args) {
		
		 LinkedList <String> ll = new LinkedList <String>();
		
		ll.add("Hasib");
		ll.add("Jawid");
		ll.add("Kamal");
		
		System.out.println("After adding elements int he LinkedList" +ll);
		
		ll.add(1,"Samim");
		
		System.out.println("After adding new element" +ll);
		
		LinkedList <String> ll2 = new LinkedList <String>();
		
		ll2.add("Safi");
		ll2.add("Shafi");
		
		ll.addAll(ll2);
		System.out.println("after adding ll2 into ll elements" +ll);
		
		
		LinkedList <String> ll3 = new LinkedList <String>();
		
		ll3.add("John");
		ll3.add("Hamid");
		// adding ll3 element into ll on specific  positison
		
		ll.addAll(1,ll3);
		System.out.println("after adding ll3 elements ll list on specific position" +ll);
		
		// after adding element on first position;
		
		ll.addFirst("Ramin");
		System.out.println("after the add first method" +ll);
		//adding the element of the last:
		
		ll.addLast("Sam");
		System.out.println("after adding the element of the last"+ll);
		
		Iterator it = ll.descendingIterator();
		
		while(it.hasNext());
		System.out.println(it.next());
		
		
		
		

	}

}
