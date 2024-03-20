package sec01.exam02;

public class NullExample {

	public static void main(String[] args) {

		String hobby = null;
		
		System.out.println(hobby.length()); // NullPointerException 발생
		
		String name = "홍자바";
		name = null;
	}

}
