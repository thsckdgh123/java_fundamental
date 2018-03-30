package methodtest07;

public class methodtest07 {

	static int x = 700; //전역변수(global variable)
	static int y = 900; 
	
	public static void printx() {
		System.out.println("3번x = " + x);
	}
	public static void main(String[] args) {
		System.out.println("1번x = " + x);
		
		int x = 800;  //지역변수(local variable)
		System.out.println("2번x = " + x);

		printx();
		
		System.out.println("4번x = " + x);
		
		System.out.println(methodtest07.x);
		
		System.out.println("y = " + y);


	}

}
