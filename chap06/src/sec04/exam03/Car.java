package sec04.exam03;

public class Car {
	// Field
	int gas;
	
	// Constructor
	
	// Method
	
	// gas의 값을 수정하기 위한 메소드
	// 외부로 부터 받은 gas를 field의 gas에 저장
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// gas가 남아있느냐 남아있지않느냐
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	// 반환값도 없고 외부로부터 받는 값도 없음
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				
				// gas가 없으니 종료하기 위해 return 사용
				return;
			}
		}
	}
}
