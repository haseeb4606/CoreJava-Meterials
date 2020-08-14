package synchronize;

public class StaticSynchronize1 {
	
public static synchronized  void display(String n) {
		
		for (int i = 1; i <6; i++) {
			
			System.out.print("I'm very bored today!!");
			
			try
			{
				Thread.sleep(1200);
			}
			catch (InterruptedException e) { System.out.println(e);}
			
			System.out.println(n);
		}
		
	}
	
	
	

}
