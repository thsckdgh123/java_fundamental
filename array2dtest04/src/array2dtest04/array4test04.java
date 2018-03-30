package array2dtest04;

public class array4test04 {
	
	public static void main(String[] args) {
		int[][] a = {
				{10, 20, 30, 40},
				{50, 60, 70, 80, 90},
				{11, 22, 33}
				
				
		};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
			
		}
		
	}
		
	

}
