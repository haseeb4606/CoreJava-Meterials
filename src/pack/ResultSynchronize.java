package pack;

public class ResultSynchronize {

	
	public static void main(String [] args) {
		
		Synchronized obj = new Synchronized();
		Synchronize1 b = new Synchronize1(obj,"Hasib");
		Synchronize1 b1 = new Synchronize1(obj, "Faye");
		Synchronize1 b2 = new Synchronize1(obj, "Love");
		Synchronize1 b3 = new Synchronize1(obj, "Jigar");
		
		b.start();
		b1.start();
		b2.start();
		b3.start();
		
	}

}

	