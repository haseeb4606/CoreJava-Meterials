package methods;

import com.practice.ParentClass;

public class Child extends ParentClass {
	
	public String parent() {
		
		return "this is from child";
	}


	public static void main(String[] args) {
		
		Child ch = new Child();
		
		System.out.println(ch.parent());
		System.out.println(ch.parent());
		
		

	}

}
