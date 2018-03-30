package bubblesort;

import java.util.Arrays;

public class bubblesort111111 {
	
	public static void main(String[] args) {
		int[] a = { 3, 4, 1, 5, 2 };

		System.out.print("버블정렬 전 : ");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					
					
				}
			}
			
			

		}
		System.out.print("버블정렬 후 : ");
		System.out.println(Arrays.toString(a));
	}
	

}
