package ch08;

public class GreedyTest {

	public static void main(String[] args) {

		// 동전 지불하기
		int[] coins = {500, 100, 50, 10};
		int price = 8370;
		int count;
		
		for (int i = 0; i < coins.length; i++) {
			count = 0;
			count += price / coins[i];
			price = price % coins[i];
			System.out.println(coins[i] + "원짜리 동전 " + count + "개가 필요합니다.");
		}
		
	}

}
