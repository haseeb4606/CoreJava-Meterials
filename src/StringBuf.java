
public class StringBuf {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hasib");
		StringBuffer sb1 = new StringBuffer("Hasib");
		
		System.out.println(sb == sb1);
		System.out.println(sb.equals(sb1));
		
		String s = "Kamal";
		
		StringBuffer s1 = new  StringBuffer("Kamal");
		
		System.out.println(s1);
		
		s1.append("jamal");
		
		System.out.println(s1);
		
		StringBuffer sb3 = new StringBuffer("Hasib");
		
		System.out.println(sb3.capacity());
		
		String j = "Hasib";
		String j1 = "Hasib";
		
		System.out.println(j.contentEquals(j1));
		
				
		
		
		
		
		
	}

}
