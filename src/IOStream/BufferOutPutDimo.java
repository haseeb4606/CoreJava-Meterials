package IOStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferOutPutDimo {

	public static void main(String[] args) throws Exception  {

		
		FileOutputStream fout = new FileOutputStream("hasib.text1");
		BufferedOutputStream bout = new BufferedOutputStream(fout); // BufferedOutPutStream has the ability to perform the operation faster if we have more data
		String s = "I live in USA";
		
		byte[] b = s.getBytes();
		
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
