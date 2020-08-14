
public class StringB_Vs_StringBuilder {

	public static void main(String[] args) {

		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for(int i = 0; i < 1000000; i++) {
			
			sb.append("Program");
		}
		
		
		System.out.println("Time Consumed By StringBuffer:"+(System.currentTimeMillis()- startTime)+"ms");
		
		
		
		
		
		System.out.println("Diffrent timining process between StringBuffer & StringBuilder-------------------------------");
		
		
		
		
		 startTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Java");
		for(int i = 0; i < 1000000; i++) {
			
			sb1.append("Program");
		}
		
		
		System.out.println("Time Consumed By StringBuilder:"+(System.currentTimeMillis()- startTime)+"ms");
		
		
		
		
		
		
	}

}
