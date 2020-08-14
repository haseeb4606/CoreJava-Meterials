package IOStream;

import java.io.*;

public class Practice2 {

	public static void main(String[] args) {
		try
		{
		
		FileOutputStream fos = new FileOutputStream("hasib.hello", true);
		
		String s = "Can you go for swiming tmorrow";
		byte [] b = s.getBytes();
		fos.write(b);
		fos.close();
	

	}
		
		catch(IOException e) {
			System.out.println(e);
		}
		

}
}