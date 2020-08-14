package collection;

import java.util.*;
public class VectorDimo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		System.out.println(v.capacity());//  default capacity is (10) & and once it reach its max capacity it automatically double the capacity 
		
		for(int i=1; i<=10; i++) {
			
			v.addElement(i);
			
			System.out.println(v.capacity()); // 10
			v.addElement(i);
			System.out.println(v.capacity()); // 20
			System.out.println(v);
			
			
			
		}
		

	}

}
