
public class ArrayHomeWork {

	public static void main(String[] args) {

		int Student [][][]  = new int[3][2][4];
			
			//{{ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24},}};
		
		Student [0][0][0] = 10;
		Student [0][0][1] = 15;
		Student [0][0][2] = 20;
		Student [0][0][3] = 30;
		
		
		Student [0][1][0] = 80;
		Student [0][1][1] = 90;
		Student [0][1][2] = 100;
		Student [0][1][3] = 110;
		
		Student [1][0][0] = 160;
		Student [1][0][1] = 170;
		Student [1][0][2] = 180;
		Student [1][0][3] = 185;
		
		Student [1][1][0] = 25;
		Student [1][1][1] = 55;
		Student [1][1][2] = 60;
		Student [1][1][3] = 30;
		
		
		Student [2][0][0] = 81;
		Student [2][0][1] = 69;
		Student [2][0][2] = 75;
		Student [2][0][3] = 35;
		
		
		Student [2][1][0] = 101;
		Student [2][1][1] = 102;
		Student [2][1][2] = 103;
		Student [2][1][3] = 104;
		
	
		
		
		for(int i=0; i < Student.length; i++) {
			
			for(int j=0; j <Student[i].length; j++) {
				
				for(int a =0; a < Student[i][j].length; a++) {
					
					
					System.out.println((i)+(j)+(a)+" = "+Student[i][j][a]);
				
				}
				
				
			}			
		}
			
			

		
	}

}
