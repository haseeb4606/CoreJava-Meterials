package collection;
import java.util.*;


public class QueueDimo {

	public static void main(String[] args) {

		Queue<String> pq = new LinkedList<String>();
		
		
		pq.add("Hasib");
		pq.add("John");
		pq.add("Mike");
		pq.add("Nawid");
		pq.add("Samim");
		
		System.out.println("Head: "+pq.element());
		System.out.println("Head: "+pq.peek());
		System.out.println("Iterating the elements");
		
		Iterator<String> it = pq.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		pq.remove();
		pq.poll();
		
		Iterator<String> it1 = pq.iterator();
		
		while(it1.hasNext()) {
			
			System.out.println(it1.next());
		}
		
		
		
		
		
	}

}
