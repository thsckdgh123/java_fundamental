class Car {
	int serialNo;
	String color;
	String gearType;
	int door;
	
	static int count = 0;
	//인스턴스 초기화
	{
		serialNo = ++count;
	
	}
	//디폴트 생성자
	Car() {
		//serialNo = ++count;
		this.color = "black";
		this.gearType = "auto";
		this.door = 4;
		//this("black", "auto", 4);
	}
	//매개변수를 받는 생성자

	Car(String color) {
		//this(color, "auto", 4);
		//serialNo = ++count;
		this.color = color;
		this.gearType = "auto";
		this.door = 4;

	}
	//매개변수를 받는 생성자
	Car(String color, String gearType, int door) {
		//serialNo = ++count;
		this.color = color;
		this.gearType = gearType;
		this.door = door;

	}
	//복사 생성자
	Car(Car c) {
		//this(c.color, c.gearType, c.door);
		//serialNo = ++count;

		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
}
public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;
		
		Car c2 = new Car("red", "manual", 2);
		
		Car c3 = new Car("blue");
		
		Car c4 = new Car(c2);
		
		System.out.println("c1의 serialNo=" + c1.serialNo + ", color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 serialNo=" + c2.serialNo + ", color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		System.out.println("c3의 serialNo=" + c3.serialNo + ", color=" + c3.color + ", gearType=" + c3.gearType + ", door=" + c3.door);
		System.out.println("c4의 serialNo=" + c4.serialNo + ", color=" + c4.color + ", gearType=" + c4.gearType + ", door=" + c4.door);

	}
}
