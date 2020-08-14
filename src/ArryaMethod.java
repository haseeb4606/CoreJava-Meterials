
public class ArryaMethod {
	
	
	static void show(int arr[]) {
		
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(max < arr[i]) {
				
				max = arr[i];
					
			}
		}
			
			System.out.println(max);
	
	}
	
	public static void main(String[] args) {

	int arr [] = {10, 200, 30, 40, 50, 60, 1000};
	
	show(arr);
		
	}	
	}
		
		

