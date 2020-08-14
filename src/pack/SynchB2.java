package pack;

public class SynchB2 extends Thread {
	
	SynchB b;
	
	
	public SynchB2(SynchB b) {
		
		this.b=b;
		
		
	}

	public void run() {
		
		b.show(50);
	}
}
