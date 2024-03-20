package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {

		String[] oldStrArray = {"Java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		// 복사 확인
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ",");
				}
	}

}
