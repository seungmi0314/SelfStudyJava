package sec01.exam03;

public class VariableExchageExample {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;
		System.out.println("x : " + x + " y : " + y);  // x = 3, y = 5
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + " y : " + y);  // x : 5 y : 3
		
		/* 이렇게만 하면 x의 값이 사라지기 떄문에 temp에 x의 값을 먼저 저장해줌
		y = x;
		System.out.println(y);  // y = 3
		*/
	}

}
