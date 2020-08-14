package collection;
import java.util.*;
public class IteratorDimo {
	
	// Description: we can apply Iterator concept for any collections object and its universal courser,
	//by using iterator we can perform both Read and Remover operations. we can create iterator object by using iterator method of collection interface

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		for(int I=0; I<=10; I++) {
			ar.add(I);
		}
		
		System.out.println(ar);
		
		Iterator itr = ar.iterator();
		while(itr.hasNext()) {
			
		Integer I (Integer)itr.next();
			
			if(I%2==0)
				System.out.println(I);
			else
				itr.remove();
			
		}
		
		System.out.println(ar);
		
		

	}

}
