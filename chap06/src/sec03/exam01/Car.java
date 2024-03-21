package sec03.exam01;

public class Car {
	// Field
	
	// Constructor
	Car(String color, int cc) {
		// 외부로부터 자동차의 색상과 배기량을 받아서 이 색상의 이 배기량을 가진 자동차 객체를 만드는 역할의 생성자
		System.out.println(color);
		System.out.println(cc);
		System.out.println(color + "색의 " + cc + "자동차가 생성됨");
	
	}
}
