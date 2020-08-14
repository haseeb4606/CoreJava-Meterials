
public class Super2ndSyntaxB extends Super2ndSyntaxA {

	
	void show() {
		
		System.out.println("Hasb Haiday");
	}
	
	void name () {
		
		System.out.println("Ahmad");
	}
	
	void dispalay() {
		
		show();
		super.show();
		name();
		
	}
	
	
	public static void main(String[] args) {

		Super2ndSyntaxB obj = new Super2ndSyntaxB();
		
		obj.dispalay();
	}

}
