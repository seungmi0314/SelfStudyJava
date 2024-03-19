package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {

		int keyCode;
		
		// read()라는 메소드를 사용하게 되면 키보드로부터 키코드를 읽는데 에러가 날 수 있음
		// 그래서 예외처리를 할 수 있도록 throws Exception를 제공함
		// 엔터키 까지 읽기 때문에 13과 10도 출력되는걸 확인 가능
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
	}

}
