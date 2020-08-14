package synchronize;

public class A2 extends Thread {
	
	A1 a;
	
	public A2(A1 a) {

	this.a = a;	
	
}
	
		public void run () {
			
			a.displayn();
		}

}
