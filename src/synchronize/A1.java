package synchronize;

public class A1 {
	
	public  void displayn() {
		
		for(int i = 1; i <=6; i++) {
			
			System.out.print(i+" - ");
			
			try
			{
				Thread.sleep(1500);
			}
			
			catch(InterruptedException e) {System.out.println(e);}
			
		}
		
		System.out.println();
	}	
	
		public synchronized void displayc() {
			
			for(int i = 65; i <= 75; i++) {
				
				System.out.print((char)i+" - ");
				
				try
				{
					Thread.sleep(1300);
				}
				
				catch (InterruptedException e) {System.out.println(e);}
			}
	
		}
	
			
		
	}
	
	
	
	
	
	
	
	
	
	
	


