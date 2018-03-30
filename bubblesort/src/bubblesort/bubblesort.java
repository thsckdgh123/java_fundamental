package bubblesort;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30, 55, 33, 88, 11, 22};
		
		System.out.print("버블정렬 전 : ");
		System.out.println(Arrays.toString(a));
	
		for(int i=0; i<a.length-1; i++) {
			boolean checked = false;
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					checked = true;
				}
			}
			System.out.print("  " + (i+1) + "회전 후 : ");
			System.out.println(Arrays.toString(a));
			if(!checked) {
				break;
		
			}
			
		}
		
		System.out.print("버블정렬 후 : ");
		System.out.println(Arrays.toString(a));

	
	}
}
