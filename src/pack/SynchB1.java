package pack;

public class SynchB1 extends Thread {
	
	SynchB b;
	
	
	public SynchB1(SynchB b) {
		
		this.b=b;
		
	}

	
	public void run() {
		
		b.show(5);
		
	}
}
