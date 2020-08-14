
import java.io.*;
import java.util.Scanner;
public class Practice {


	public static void main (String [] args) throws IOException {
		
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your src file");
		
		String srcFile = scn.nextLine();
		
		System.out.print("Enter your dist file");
		
		String distFile = scn.nextLine();
		
		
		FileInputStream fin = new FileInputStream("srcFile");
		FileOutputStream fos = new FileOutputStream("distFile");
		
		int data;
		
		while((data=fin.read())!=-1) {
			
			System.out.print((char)data);
			
			
		}

			
		
		fin.close();
		fos.close();
		
		
	}
		
}