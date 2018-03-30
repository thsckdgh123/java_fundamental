package methodtest06;

import java.util.Scanner;
public class methodtest06 {
	
	public static void drawChars(char c, int a) {
		
		for(int i=1; i<=a; i++) {
			System.out.print(c);

		}
			
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 문자를 직각삼각형 모양으로 찍는 프로그램 ***");
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		System.out.print("개수 입력 : ");
		int a = sc.nextInt();
		
		
		for(int i=1; i<=a; i++) {
			drawChars(' ', i-1);
			drawChars(c, a-i+1);
		System.out.println();

		}
		
		sc.close();
	}

}
