package array2dtest05;

import java.util.Scanner;

public class array2dtest05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행(열) 수 입력 : ");
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		int k=0;
				
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = ++k;
			}
		}
				
				for(int i=0; i<a.length; i++) {
					for(int j=0; j<a[i].length; j++) {
						
						System.out.printf("%5d", a[i][j]);
						
					}
					
					System.out.println();
					
					
				}
		}
	}

