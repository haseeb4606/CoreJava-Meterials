package test;

public class WhileLoop {

	public static void main(String[] args) throws InterruptedException {
		
		
		int a = 0;
		
		while(a <=5) {
			
			Thread.sleep(1000);
			System.out.println(a);
			
			a++;
			
		}
	
		System.out.println("Loop Finished");
			
	}

}
