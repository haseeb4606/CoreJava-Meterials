
public class StringMethods {

	
	public static void main(String[] args) {
		
		String s = new String("Hasib");
		String s1 = new String("Hasib");
		
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		String name = "Jamil";
		
		String s2 = new String("Jamil");
		
		System.out.println(s2);
		
		s2=s2.concat("Ahmad");
		
		System.out.println(s2);
		
String obj = new String ("Cooke ");
		
		obj.concat("Sprite");
		
	String obj1 = obj.concat("GingerAle ");
	
	obj1.concat("Redbull ");
	obj1 = obj1.concat("Pepsi");
	
	System.out.println(obj);
	System.out.println(obj1);
	System.out.println("--------------------------");
	String c = new String("I can not do this");
	String c1 = new String("I can not do this");
	
	System.out.println(c==c1);
	
	String d = "I can not do this";
	String f = "I can not do this";
	String g = "I can not" + "do this";
	
	String h = "I can not ";
	String i = "do this";
	
	h=h.concat("do this");
	
	System.out.println(h);
	System.out.println(d==f);
	System.out.println(d.equals(f));
	
	byte [] b = {97,98,99,100};
	String s3 = new String(b);
	System.out.println(s3);
	
	char a [] = {'F','A','Y','E'};
	String b2 = new String(a);
	System.out.println(b2);
	
	byte name1 [] = new byte [3];
	
	name1[0] = 97;
	name1[1]= 100;
	name1[2] = 99;
	String j1 = new String(name1);
	System.out.println(j1);
	
	System.out.println("-----------------------------");
		
			///  String Methods ---------------
	
		
		
	//	LowerCase and UpperCase;
		
		String obj2 = "HasIbhIdaRy";
		System.out.println(obj2.toUpperCase());
		System.out.println(obj2.toLowerCase());
		System.out.println(obj2);
		
		// Trim: Trim method elements the spaces before after the String.
		
		String A = "   Hasib";
		String A1 = "             Hasib Haidary ";
		
		System.out.println(A.trim());
		System.out.println(A1.trim());
		
		// charAt()
		String b1 = "UniverSityOfVirginia";
		System.out.println(b1.charAt(2));
		
		//equals() & equalsIgnoreCase());
		String j = "SCHOOL";
		System.out.println(j.equals("SchOoL")); //False	
		System.out.println(j.equalsIgnoreCase("school")); //True
		
		//isEmpty();
		String a1 = "Hasib";
		String a2 = "";
		System.out.println(a1.isEmpty()); //False	
		System.out.println(a2.isEmpty()); // True
		
		//Length();
		String a3 = "IliveInVirginia";
		System.out.println(a3.length());
		
		//Replace();
		String a4 = "abbabbabbabb";
		System.out.println(a4.replace('b', 'm'));
		
		//Substring();
		String a5 = "ABCDEFGHIJK";
		System.out.println(a5.substring(0,8));
		
		// indexOf();
		String a6 = "UniversityOfVirginia";
		System.out.println(a6.indexOf("i"));
		System.out.println(a6.lastIndexOf("i"));
		
		//toLowerCase toUpperCase ();
		String a7 = "how is your day!!";
		System.out.println(a7.toUpperCase());
		System.out.println(a7.toLowerCase());
		
		
		byte [] num3 = {104,97,100,105};
		
		String b6 = new String(num3);
		
		System.out.println(b6);
		
		
		
		
		
		
		
		
		
		
		
		// --------------------------
		// StartsWith() & endsWith()

	}

}
