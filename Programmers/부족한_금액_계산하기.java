
public class 부족한_금액_계산하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(solution(price, money, count));

	}

	public static long solution(int price, int money, int count) {
		long answer = 0;
		int total = 0;
		
		for (int i = 0; i < count; i++) {
			total += (i+1)*price;
		}
		
		if (total<=money) {
			answer = 0;
		} else answer = total-money;
		
		return answer;
	}

}
