
public class multiDiminsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] buildingNumber = new int [2][4];
		
		// array 1 index 0
		buildingNumber[0][0] = 10;
		buildingNumber[0][1] = 50;
		buildingNumber[0][2] = 100;
		buildingNumber[0][3] = 55;
		
		System.out.println(buildingNumber[0][3]);
		
		// array 2 index 1
		
		buildingNumber[1][0] = 100;
		buildingNumber[1][1] = 150;
		buildingNumber[1][2] = 200;
		buildingNumber[1][3] = 300;
		
		for(int i = 0; i <buildingNumber.length; i++) 
			
		for(int j = 0; j < buildingNumber[i].length; j++) {
		
		System.out.println(buildingNumber[i][j]);
			
		}
		
		
		}
	}


