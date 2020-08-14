

public class Test extends Thread   {

	
	public void run(){
		
		for (int i=0; i<5000; i++) {
			
			System.out.println("I'm lazy thread" );
		
		
		try
		{
			Thread.sleep(2000);
		}
		
		catch(InterruptedException e) {}
		
		
		}
	}

	}
