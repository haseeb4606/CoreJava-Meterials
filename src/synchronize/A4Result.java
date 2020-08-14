package synchronize;

public class A4Result {

	public static void main(String[] args) throws InterruptedException {
		
		A1 a = new A1();
		A2 a2 = new A2(a);
		A3 a3 = new A3(a);
		
		a2.start();
		a2.join();
		a3.start();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
