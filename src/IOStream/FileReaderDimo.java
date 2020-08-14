package IOStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDimo {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("hasib.hello");
		
		int i=0;
		
		while((i=fr.read())!=-1) {
			
			System.out.print((char)i);
		}
		
		
		// homeword read about buffredreader and BuffreadWriter
		
		
		// first we need fileWriter then buffredWriter and pass the refrence variable of file writer to buffredWriter
		
		
		

	}

}
