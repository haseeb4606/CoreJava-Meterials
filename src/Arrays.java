 

public class Arrays {
	


	public static void main(String[] args) {
		
		// 1st Syntax

		
		int [] b = new int [5];
		
		b [0] = 250;
		
		b [1] = 300;
		
		b [2] = 1000;
		
		b [3] = 2500;
		
		b [4] = 145;
		
		System.out.println(b[2]);
		
		
		// 2nd Syntax
		
		int i [] = new int [5];
		
		i[0] = 90;
		
		i[1] = 120;
		
		i[2] = 200;
		
		i[3] = 125;
		
		i[4] = 223;
		
		System.out.println(i [0]);
		
		// 3d Syntax
		
		String[] name = {"Kamal", "SATAR", "JAWAD", "LOVE", "SAFI", "HASIB", "AJMIR", "LATIF"};
		
		name [5] = "FAYEZ";   // The following step allow us to change the array's name
		
		name [2] = "JABAR";
		
		System.out.println(name[2]);
		
		System.out.println(name.length);
		
		
		// For lope and For each lope in Array
		
		int y [] = new int [5];
		
		y[0] = 10;
		
		y[1] = 20;
		
		y[2] = 30;
		
		y[3] = 40;
		
		y[4] = 50;
		
		y[3] = 100;
		
		for(int k = 0; k < y.length; k++)
		
		System.out.println(y [k]);
		
		
		String name1 [] = { "Mazda", "Corolla", "BMW", "Hyndai"};
		
		for(String n:name1)
		
		System.out.println(n);
		
		
		
		
		// Multidimensional Array
		
		int [][] c = {{1,2,3}, {3,4,5}, {6,7,8}};
		
		
		for (int m = 0; m<c.length; m++) {
			
			
			for(int j =0; j <3; j++) {
				
				System.out.print(c[m][j]+"  ");
			}
			
			
			System.out.println();
		
		
		
	}
	}
}
 


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	