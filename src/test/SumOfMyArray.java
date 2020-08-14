package test;

public class SumOfMyArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,25,20,10};
		
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			sum = sum +arr[i];
		}
		
		System.out.println(sum);

	}

}
