package synchronize;

public class A3 extends Thread {
	
	A1 a;
	
	public A3(A1 a) {
		
		this.a = a;
		
	}
	
		public void run() {
			
			a.displayc();
		}

}
