import java.util.concurrent.ExecutionException;
import java.util.*;
import java.util.Arrays;
public class ExceptionHandlingDimo {

	public static void main(String[] args) {

		
		
		/*
		 * try {
		 * 
		 * 
		 * System.out.println("Statement 1"); System.out.println(10/1);
		 * System.out.println("Statement 3");
		 * 
		 * try {
		 * 
		 * System.out.println("Statement 4"); System.out.println("Statement 5");
		 * System.out.println("Statement 6"); } catch(ArithmeticException e) {
		 * System.out.println("Statement 7 "); }
		 * 
		 * finally { System.out.println("Statement 8"); }
		 * 
		 * System.out.println("Statement 9"); } catch(ArrayIndexOutOfBoundsException e)
		 * { System.out.println("Statement 10"); }
		 * 
		 * finally { System.out.println("Statement 11 "); }
		 * 
		 * System.out.println("Statement 12");
		 * 
		 */
	
	
		try 
		{
			
		}
		
		finally {
			
		}
		
		int array []= {1,5,4,3,2};
		
		Arrays.parallelSort(array);
		
		System.out.println(array);
		
		
		for(int i=0; i<=array.length; i++) {
			
			System.out.println(i);
		}
	
		}
		}	

