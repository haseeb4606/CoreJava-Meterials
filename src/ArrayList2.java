
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
ArrayList<String> al = new ArrayList<String>();
		
		// Adding object into the ArryaList.
		
				al.add("Hasib");
				al.add("Kamal");
				al.add("Sami");
				al.add("Hamid");
				al.add("Hasib");
		
		
		Iterator it = al.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
			for(String s:al) {
				
				System.out.println(s);
			}
			
			
		
		}
		

	}

}
