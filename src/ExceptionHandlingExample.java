
public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		try {
			
			
			
		try {
			
		int	a = 35/0;
			
		}
		
		catch
		(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		try {
			
			int b [] = new int [10];
			
			b[5] = 50;
		}
		
		catch	(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(e);
		}
		
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
		
		
		}	
	}
 
		


