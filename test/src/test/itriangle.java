package test;

import java.util.*;

public class itriangle{
	public static void main(String[] args){
		
		int i, j;

		Scanner sc = new Scanner(System.in);
		System.out.print("num : ");
		int a = sc.nextInt();

		for(i=0; i<=(a-1)/2; i++){
			for(j=0; j<=a/2-i; j++){
				System.out.print(" ");
				
			}
			for(j=0; j<2*i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}