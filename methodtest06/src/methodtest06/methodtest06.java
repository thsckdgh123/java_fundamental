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
		
		System.out.println("*** ���ڸ� �����ﰢ�� ������� ��� ���α׷� ***");
		System.out.print("���� �Է� : ");
		char c = sc.next().charAt(0);
		System.out.print("���� �Է� : ");
		int a = sc.nextInt();
		
		
		for(int i=1; i<=a; i++) {
			drawChars(' ', i-1);
			drawChars(c, a-i+1);
		System.out.println();

		}
		
		sc.close();
	}

}
