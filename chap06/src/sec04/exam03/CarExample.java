package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		// 가스 주입
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		// isLeftGas() 메소드에 의해 True 혹은 False 값이 담김
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		// 이 if문이 이 자리에 있으면 gas가 0일때만 도달하기 때문에 항상 else문만 출력된다
		// 첫번째 문장이 출력되려면 좀 더 위에 작성되어야 함
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {
			System.out.println("gas를 주입하세요");
		}
		
	}

}
