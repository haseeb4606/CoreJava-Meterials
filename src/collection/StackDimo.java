package collection;

import java.util.*;

public class StackDimo {
	
	// its the child class of Vector its specially design the class for last in first out order (LIFO) it only has one constructor. 
	

	public static void main(String[] args) {

		// Methods:
		
		Stack s = new Stack();
		
	s.push("Zabi");
	s.push(25);
	s.push(30);
	s.push(31);
	s.push("Nabi");
	
//	System.out.println(s.peek());
    System.out.println(s.pop());
//	s.push("Nabi");
//	System.out.println(s);
//	System.out.println(s.peek());
//	System.out.println(s.search(31));
//	System.out.println(s.empty());
	
	
}		
	
}