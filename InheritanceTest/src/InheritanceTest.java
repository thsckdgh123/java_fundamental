class Parent {
	int money = 2000000000;

	void appearance() {
		System.out.println("잘 생긴 외모");
	}
	void character() {
		System.out.println("화통한 성격");
	}
	int getMoney() {
		return money;
	}
}

class Child extends Parent {
	@Override
	void appearance() {
		super.appearance();
		System.out.println("훤칠한 키");

	}
	@Override
	void character() {
		System.out.println("차분한 성격");
	}
	
}
public class InheritanceTest {
	public static void main(String[] args) {
		Child boy = new Child();
		boy.appearance();
		boy.character();
		
		System.out.println("재산은 " + boy.money + "을 가지고 있습니다.");
		
	}
}
