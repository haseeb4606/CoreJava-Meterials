package test;

import java.util.*;

public class If_Else_Else_If {
	
	
	public static void main(String[] args) {
		
		LinkedList lk = new LinkedList();
		
		lk.add("Hasib");
		lk.add("Nawid");
		lk.add("Jabar");
		lk.add("Faye");
		lk.add("Mike");
		lk.addFirst("Carlos");
		
		
		
		
	
		if(lk.contains("Hasid")){
			
			System.out.println("John added to the list" +lk.set(1, "John"));
		
		} 
		else {
			
			System.out.println("no name matched");
			
			
		}
			if(lk.contains("Carlos")) {
				System.out.println("Carlos was deleted from the list "+lk.remove("Carlos"));
			}
			
			
			
			if (lk.contains("Mike")) {
				System.out.println(lk.set (4,  "Navin")+" was Replced with Navin");
			}
		
			else {
				System.out.println("Mike not found");
			}
	}
		
		
		
		
		
		

	}


