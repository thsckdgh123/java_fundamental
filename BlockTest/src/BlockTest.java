
public class BlockTest {
	
	static {
		System.out.println("클래스 초기자");
	}
	{
		System.out.println("인스턴트 초기자");
	}
	
	public BlockTest() {
		System.out.println("디폴트 생성자");
	}
	public static void main(String[] args) {
		System.out.println("BlockTest bt1 = new BlockTest()");
		BlockTest bt1 = new BlockTest();
		
		System.out.println();
		System.out.println("BlockTest bt2 = new BlockTest()");
		BlockTest bt2 = new BlockTest();
	}
}
