package pack;

public class SynchB {
	
	public void show(int n) {
		
		synchronized (this) {
			
			for (int i =1; i<5; i++) {
				
				System.out.println(i*n);
				
				try
				{
					Thread.sleep(500);
				}
				
				catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}

}
