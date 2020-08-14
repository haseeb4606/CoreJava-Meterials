package synchronize;

public class StaticSynchronize3 extends Thread{
	
	StaticSynchronize1 s;
	String n;
	
	public StaticSynchronize3(StaticSynchronize1 s, String n) {
		
		this.n=n;
		this.s = s;
	}
	
	
		public void run() {
			
			s.display(n);
		}

}
