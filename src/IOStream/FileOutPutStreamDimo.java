package IOStream;
import java.io.FileOutputStream;

public class FileOutPutStreamDimo {

	public static void main(String[] args) {
		
		
		try {
		FileOutputStream fout = new FileOutputStream("hasib.txt");
				
				String s = "Hi How are you";
				byte [] b = s.getBytes();
				fout.write(b);
				fout.close();
				System.out.println("Success");
		}
		
		
		catch (Exception e) {
			
			System.out.println(e);
		}
		

	}

}

