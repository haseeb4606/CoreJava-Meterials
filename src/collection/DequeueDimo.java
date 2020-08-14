package collection;
import java.util.*;


//Dequeue: it is a liner collection that supports element insertion and removal at both ends 
//Array Dequeue class provides the facility of using Dequeue and resizeable Array, it inherits abstract collection class and implements the Dequeue interface
//1 -unlike Queue we can add or remove element from both sides
//2 - nul elements are not allowed in the array Dequeue.
//3 - it is not trade safe and it has no capacity restriction 

public class DequeueDimo {

	public static void main(String[] args) {

	Deque<String> d = new  LinkedList<String>();	
		
		d.add("Element 1 (Tail)");
		d.addFirst("Element 2 (Head)");
		d.addLast("Element 3 (Tail)");
		d.push("Element 4 (Head)");
		d.offer("Element 5 "
				+ "(Tail)");
		d.offerFirst("Element 6 (Head)");
		d.offerLast("Element 7 (Tail)");
		
		Iterator<String> it = d.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
