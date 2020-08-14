package collection;

import java.util.*;
public class LinkedListDimo {

	public static void main(String[] args) {
		
		LinkedList<String> l = new  LinkedList<String>();
		
		l.add("John");
		l.add("Nawid");
		l.add("Zamir");
		l.add(null);
		l.add("Nawid");
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
		l.set(0, "Hasib");
		System.out.println(l);
		
		
		
		
		
	}

}
