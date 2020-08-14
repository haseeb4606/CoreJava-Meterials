package pack;

public class Synchronize1 extends Thread{ 
			
	
	Synchronized obj;
	
	String n;
	
public  Synchronize1(Synchronized obj, String n) {
		
		this.obj = obj;
		this.n = n;
		
	}
	
	public void run() {

		obj.show(n);


}

}