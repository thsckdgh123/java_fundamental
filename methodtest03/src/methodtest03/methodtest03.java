package methodtest03;

import java.util.Scanner;

public class methodtest03 {
	
	public static double power(double x, int n) {
		double result=1;
		for(int i=0; i<n; i++) {
			result *= x;
		}
		return result;
		 
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 입력 : ");
		double a = sc.nextDouble();
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		
		//방법1 메소드를 사용 하지 않았을때
/*		double result = 1;
		for(int i=0; i<b; i++) {
			result *= a;//result = result * a;
		}
		
		System.out.println(a + "의 " + b + "승은 " + result + "입니다."); */
		
		//방법2 메소드를 사용 했을때
		
		double result = power(a, b);
		
		System.out.println(a + "의 " + b + "승은 " + result + "입니다.");

		
		
		
		
		sc.close();
	}

}
