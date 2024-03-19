package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
					// q의 키코드 = 113
			if(keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료");
	}

}
