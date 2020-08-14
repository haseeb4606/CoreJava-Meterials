package IOStream;

import java.io.*;
import java.lang.*;

public class Practice1 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("hasib.hello");
		FileOutputStream fos = new FileOutputStream("hasib.text");
		
		int i;
		
		while((i=fis.read())!=-1) {
			fos.write(i);
		}
				
		fis.close();
		fos.close();
		
		System.out.println("data copied");
		
		
		
		
		
		
		
		
	}

}
