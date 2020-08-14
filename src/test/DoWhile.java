package test;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		/*
		 * int a = 10;
		 * 
		 * do { System.out.println("I would like to go to shopping");
		 * 
		 * a--; }
		 * 
		 * 
		 * while( a>=5);
		 */	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome, please chose your food from the Menue");
		System.out.println();
		
		int choice;
		
		do {
			menuPrompt();
	
			
			choice = input.nextInt();
			
			switch(choice) {
			
			case 1:
					
				System.out.printf("Kabob");
				
				break;
				
			case 2:
					System.out.printf("Biryane");
				
			break;
			
				
			case 3:
				
				System.out.printf("Palow");
				
				break;
				
			case 4:
				
				System.out.printf("Okra");
				
				break;
				
			case 5:
				
				System.out.printf("Bolani");
				
			case 0:
				
				System.out.printf("Good Bye");
				
				break;
				
				default:
					
					System.out.println("Invalid Selection");
				
					break;
				
			}
			
			System.out.println();
			
		}
		
		while(choice !=0);
		
		
	
		

	}

	private static void menuPrompt() {
		
		System.out.println("1 . . Kabob");
		System.out.println("2 . . Biryane");
		System.out.println("3 . . Palow");
		System.out.println("4 . . Okra");
		System.out.println("5 . . Bolani");
		
	}

}
