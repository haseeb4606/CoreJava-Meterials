package IOStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputDimo {

	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream fin = new FileInputStream("hasib.txt");
			
			//int i = fin.read();
		//	System.out.println((char)i); // this will only print one character.
		//	fin.close();
			

			int i;
			while ((i=fin.read())!=-1) {
				System.out.print((char)i); // Dicription: if we want to print all our chracter then we should go for this method.
			}
				fin.close();	
		}
		
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
