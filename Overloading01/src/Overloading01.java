import java.util.Scanner;

public class Overloading01 {

	public static int max(int a, int b) {
		if(a>b) {
			return a;}
		else {
			return b;}
	}
	
	public static int max(int a, int b, int c) {
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		return max;
	}



	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 1번 입력 : ");
		int x = sc.nextInt();
		System.out.print("정수 2번 입력 : ");
		int y = sc.nextInt();
		System.out.print("정수 3번 입력 : ");
		int z = sc.nextInt();

		System.out.println("두 개 정수의 최대값은 " + max(x,y) + "입니다.");
		System.out.println("세 개 정수의 최대값은 " + max(x,y,z) + "입니다.");
				
				
				
				
				
		sc.close();
	}
	

}
