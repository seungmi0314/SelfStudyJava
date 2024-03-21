package sec03.exam01;

public class CarExample {

	public static void main(String[] args) {

		// Car클래스에 기본생성자가 없기때문에 사용 불가능
		// Car myCar = new Car();
		
		// 내가 생성한 생성자에 맞게 매개변수를 입력해 주어야 함
		Car myCar = new Car("검정", 3000);
	}

}
