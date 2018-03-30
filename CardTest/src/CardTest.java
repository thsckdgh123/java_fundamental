class Card {
	//인스턴스 변수, 비정적 필드(non-static field)
	String kind;
	int number;
	//클래스 변수, 정적 필드(static field)
	static int width = 100;
	static int height = 250;
	
	// 기본 생성자(디폴트 생성자)
	Card() {
		
	}
	// 생성자가 오버로딩
	Card(String k, int n) {
		kind = k;
		number = n;
	}
}
public class CardTest {
	public static void main(String[] args) {
		
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + 
				"이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + 
				"이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + 
				"이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + 
				"이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
		Card c3 = new Card("Diamond", 13);
		System.out.println("c3은 " + c3.kind + ", " + c3.number + 
				"이며, 크기는 (" + c3.width + ", " + c3.height + ")");
		System.out.println("c3은 " + c3.kind + ", " + c3.number + 
				"이며, 크기는 (" + c3.width + ", " + c3.height + ")");
		
	}
}
