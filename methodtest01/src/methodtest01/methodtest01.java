package methodtest01;
import java.util.Scanner;
public class methodtest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		
		for(int i=0; i<height.length; i++) {
			System.out.println("--- " + (i+1) + "번째 학생 ---");
			System.out.print("신장 : ");
			height[i] = sc.nextInt();
			System.out.print("체중 : ");
			weight[i] = sc.nextInt();
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
		}
		
		int maxheight = height[0];
		if(maxheight < height[1]) maxheight = height[1];
		if(maxheight < height[2]) maxheight = height[2];

		
		int maxweight = weight[0];
		if(maxweight < height[1]) maxweight = weight[1];
		if(maxweight < height[2]) maxweight = weight[2];

		int maxage = age[0];
		if(maxage < age[1]) maxage = age[1];
		if(maxage < age[2]) maxage = age[2];


		System.out.println("신장의 최댓값 : " + maxheight); 
		System.out.println("체중의 최댓값 : " + maxweight); 
		System.out.println("나이의 최댓값 : " + maxage); 

		
		
		sc.close();
	}

}
