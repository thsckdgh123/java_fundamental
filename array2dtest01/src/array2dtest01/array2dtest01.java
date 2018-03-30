package array2dtest01;

public class array2dtest01 {
	
	
	public static void main(String[] args) {
		int[][] a = new int[3][4];
		
		a[0][1] = 10;
		a[1][2] = 20;
		a[2][3] = 30;
//		a[3][4] = 40;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d", a[i][j]);
				
			}
			
			System.out.println();
			
		}
	}

}
