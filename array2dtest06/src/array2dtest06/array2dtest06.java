package array2dtest06;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class array2dtest06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int [4][5];
		
		
			System.out.print("����� ��(1~45) : ");
			int n = sc.nextInt();
			int result = 0;
			
			//2���� �迭�� ������ �����ؼ� �����Ѱ�
			System.out.println();
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					a[i][j] = (int)(Math.random()*45)+1;

					
				}
		
			}
			// 2���� �迭�� ���� ���
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					{
					System.out.printf("%5d", a[i][j]); 
					}
			
				}
				System.out.println();
			}

			
			// ����� ���� 2���� �迭�� ���� ��
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
				System.out.println("���� ���Դϴ�.");
				break;
			case 1:
				System.out.println("������ ���Դϴ�.");
				break;
			case 2:
				System.out.println("���� ���� ���Դϴ�.");
				break;
			case 3:
				System.out.println("��� ������ ���Դϴ�.");
				break;
			case 4:
				System.out.println("����� ���Դϴ�.");
				break;
			default:
				System.out.println("��Ʈ�� ¯ ����� ���Դϴ�.");
				break;
			}
			
			System.out.println("���߽� ������ " + count+ "���Դϴ�.");
			
			
			
			sc.close();
			
	}}
			
		
			
	
	
