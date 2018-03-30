package array2dtest06;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class array2dtest06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int [4][5];
		
		
			System.out.print("행운의 수(1~45) : ");
			int n = sc.nextInt();
			int result = 0;
			
			//2차원 배열에 난수를 생성해서 대입한것
			System.out.println();
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					a[i][j] = (int)(Math.random()*45)+1;

					
				}
		
			}
			// 2차원 배열의 값을 출력
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					{
					System.out.printf("%5d", a[i][j]); 
					}
			
				}
				System.out.println();
			}

			
			// 행운의 수와 2차원 배열의 값을 비교
			int count = 0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if(n == a[i][j]) {
					++ count;
				}
			}
			}
			
			
			switch(count) {
			
			case 0:
				System.out.println("보통 날입니다.");
				break;
			case 1:
				System.out.println("괜찮은 날입니다.");
				break;
			case 2:
				System.out.println("운이 좋은 날입니다.");
				break;
			case 3:
				System.out.println("운수 대통인 날입니다.");
				break;
			case 4:
				System.out.println("대박인 날입니다.");
				break;
			default:
				System.out.println("울트라 짱 대박의 날입니다.");
				break;
			}
			
			System.out.println("맞추신 갯수는 " + count+ "개입니다.");
			
			
			
			sc.close();
			
	}}
			
		
			
	
	
