package test;

public class FirstRepeatingArray {

	
	static void my(int[]array) {
		
		for(int i=0; i <array.length; i++) {
			
			int count = 0;
			
			for(int j = 0; j<array.length; j++) {
				
				if(array[i]==array[j])
					count++;
			}
			
			if (count>=2) {
				
				System.out.println(array[i]);
				
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		my(new int[] {1,2,3,4,4,6,7,9,10,10});

	}

}
