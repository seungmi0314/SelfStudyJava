package sec04.exam02;

public class Computer {
	// Field
	// Constructor
	// Method
	
	// 입력받을 모든 값을 더해줄거임(매개변수 개수 정해지지 않음)
	// 배열객체를 매개값으로 제공
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++ ) {
			sum += values[i];
		}
		
		return sum;
	}
	
	// 값의 목록으로 제공
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++ ) {
			sum += values[i];
		}
		
		return sum;
	}
}
