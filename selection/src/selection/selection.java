package selection;

public class selection {

	public static void main(String[] args) {
		int[] a = new int[] {50, 70, 20, 10, 30};
		
		System.out.print("선택 정렬 전 : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
		
	
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
			
			if(a[i] > a[j]) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;		
			}
		}
		System.out.print(i+1 + "회전 후 : ");
		for(int k=0; k<a.length; k++)
			System.out.print(k +" ");
			System.out.println();
			
	}
	System.out.print("선택 정렬 후 : ");
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i] + " ");
	}
	
}
	}
