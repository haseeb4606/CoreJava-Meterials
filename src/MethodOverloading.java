
public class MethodOverloading {
	
	int add(int a, int b) {
		
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
		void add(int k, int j, int i) {
			
			k =j+i;
			
			System.out.println(k);	
		}

		void add() {
			
			String name = "Hasib";
			String address = "VA";
			System.out.println(name+" "+address);
		}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
        obj.add(10, 20);
        obj.add(200, 300, 500);
        obj.add();
        
		
	}

}
