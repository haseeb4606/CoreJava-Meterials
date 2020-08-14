package synchronize;

public class MySynchronizeResult {
	

	public static void main(String[] args) {
		

		StaticSynchronize1 s = new StaticSynchronize1();
		StaticSynchronize1 s1 = new StaticSynchronize1();
		StaticSynchronize2 s2 = new StaticSynchronize2(s, "Hasib");
		StaticSynchronize2 s3 = new StaticSynchronize2(s1, "Nazir");
		StaticSynchronize3 s4 = new StaticSynchronize3(s, "Faye");
		
		
		s2.start();
		s3.start();
		s4.start();
		

	}

}
