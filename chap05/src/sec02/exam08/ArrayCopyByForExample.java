package sec02.exam08;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
	
		// for문을 이용한 복사
		int[] oldIntArray = {1, 2, 3}; // 배열 길이를 늘리고 싶음
		int[] newIntArray = new int[5]; // 그래서 새로운 배열 생성
		
		// 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		// 복사 확인
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ",");
		}
	}
}
