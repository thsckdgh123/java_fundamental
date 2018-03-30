package methodtest08;

import java.util.Scanner;
public class methodtest08 {

	public static int getmax(int[] x) {
		int max = x[0]; 
		for(int i=0; i<x.length; i++) {
			if(max < x[i])
				max = x[i];
		}
		return max;

	}
	
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("*** 건강 체크 프로그램 ***");
			System.out.print("학생 수 입력 : ");
			int n = sc.nextInt();
			
			int[] height = new int[n];
			int[] weight = new int[n];
			int[] age = new int[n];
			
			for(int i=0; i<n; i++) {
				System.out.println("--- " + (i+1) + "번째 학생 ---");
				System.out.print("신장 입력 : ");
				height[i] = sc.nextInt();
				System.out.print("체중 입력 : ");
				weight[i] = sc.nextInt();
				System.out.print("나이 입력 : ");
				age[i] = sc.nextInt();
			}

			int maxheight = getmax(height);
			int maxweight = getmax(weight);
			int maxage = getmax(age);
			
			System.out.println("신장의 최댓값 : " + maxheight);
			System.out.println("체중의 최댓값 : " + maxweight);
			System.out.println("나이의 최댓값 : " + maxage);

			sc.close();
	}

}
