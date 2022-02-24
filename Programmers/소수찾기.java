
public class 소수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution(10));

	}

	static class Solution {
		public static int solution(int n) {
			int answer = 0;
			int[] arr = new int[n + 1];

			arr[0] = arr[1] = 0; // 소수가 아니면 0, 소수면 1

			for (int i = 2; i <= n; i++) {
				arr[i] = i;
			}

			// 2부터 시작해서 그의 배수들을 0으로 만든다.
			// 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
			for (int i = 2; i < n; i++) {
				if (arr[i] == 0)
					continue;

				for (int j = 2 * i; j <= n; j += i) {
					arr[j] = 0;
				}
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0)
					answer++;
			}

			return answer;
		}
	}

}
