package synchronize;

public class StaticSynchronize2 extends Thread{
	
	StaticSynchronize1 s;
	String n;
	
	public StaticSynchronize2 (StaticSynchronize1 s, String n) {
		
		this.s=s;
		this.n=n;
	}
	
	public void run() {
		
		s.display(n);
	}
	
	
	
	
	
	

}
