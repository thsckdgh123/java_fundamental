package methodtest05;

import java.util.Scanner;
public class nethodtest05 {
	
	public static void count(int n) {
		for(int i=n; i>=0; i--) {
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 카운팅 프로그램 ***");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		System.out.println("카운트가 시작되었습니다.");
		count(n);
		System.out.println("카운트가 종료되었습니다.");

		
		sc.close();
		
	}

}
