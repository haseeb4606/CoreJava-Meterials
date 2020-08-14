
public class JoinMethodThread extends Thread {
	
	static Thread mt;

	public void run() {
		
		for(int i = 1; i <5; i++) {
				
			
		
		System.out.println("Child class");
		
		}
	}
	
	
				
		public static void main(String[] args) throws InterruptedException {
			
			JoinMethodThread.mt=Thread.currentThread();
			JoinMethodThread obj = new  JoinMethodThread();
		
			
			obj.start();
			
			
			
			for(int i=0; i<5; i++) {
		
			System.out.println("Main Thread");
			
			try
			{
				obj.sleep(3000);
			}
			
			catch(InterruptedException e) {}
			
			
			
			}
		}
			
		}




		

	

