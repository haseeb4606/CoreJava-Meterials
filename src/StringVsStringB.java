
public class StringVsStringB {
	
	public static void main(String[] args) {
		
		// String Hash code:
		
		System.out.println("Hash code for String");
		String s = "Java";
		System.out.println(s.hashCode());
		s = s.concat("Program");
		System.out.println(s.hashCode());
		System.out.println();
		
		// StringBuffer Hash Code:
		System.out.println("Hash code for StringBuffer");
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.hashCode());
		sb.append("Program");
		System.out.println(sb.hashCode());
		
		
		
		
		

	}

}
