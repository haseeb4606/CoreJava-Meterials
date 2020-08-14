package test;

public class MethodOverriding2 extends MethodOverriding1 {
	
	public void sum() {
		
		int x = 20;
		int y = 50;
		
		int i = x+y;
		
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		MethodOverriding2 obj = new MethodOverriding2();
		
		obj.sum();

	}

}
