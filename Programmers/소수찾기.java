
public class �Ҽ�ã�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solution(10));

	}

	static class Solution {
		public static int solution(int n) {
			int answer = 0;
			int[] arr = new int[n + 1];

			arr[0] = arr[1] = 0; // �Ҽ��� �ƴϸ� 0, �Ҽ��� 1

			for (int i = 2; i <= n; i++) {
				arr[i] = i;
			}

			// 2���� �����ؼ� ���� ������� 0���� �����.
			// 0�̸� �Ѿ�� �ƴϸ� ���� ������� �ٽ� 0���� �����.
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
