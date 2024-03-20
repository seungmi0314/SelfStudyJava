package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		// 왜 int 타입으로 선언을 했나 -> 배열이 int타입이기 때문에 요소들이 int라서
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
