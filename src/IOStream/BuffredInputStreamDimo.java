package IOStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BuffredInputStreamDimo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin = new FileInputStream("hasib.text");
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		
		int i=0;
		
		while((i=bin.read())!=-1) {
			
			System.out.print((char)i);
		}
		
		
		bin.close();
		fin.close();
		
		
		
		
		
		
		
		
		
		

	}

}
