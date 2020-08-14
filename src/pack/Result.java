package pack;

public class Result {

	public static void main(String[] args) {
		
		SynchB b = new SynchB();
		SynchB1 b1 = new SynchB1(b);
		SynchB2 b2 = new SynchB2(b);
		
		
		b1.start();
		b2.start();
		

	}

}