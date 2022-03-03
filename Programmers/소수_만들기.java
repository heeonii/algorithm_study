package Programmers;

import java.util.Arrays;

public class 소수_만들기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,7,6,4 };
		System.out.println(Solution.solution(nums));
	}

	static class Solution {
		public static int solution(int[] nums) {
			int answer = 0;
			for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					for (int k = j+1; k < nums.length; k++) {
						int sum = nums[i] + nums[j] + nums[k];
						if (isPrime(sum)) answer++;
					}

				}
				
			}

			return answer;
		}

		public static boolean isPrime(int sum) {
			int cnt = 0;
			for (int i = 1; i <= Math.sqrt(sum); i++) {
				if (sum % i == 0)
					cnt++;
			}
			return cnt == 1 ? true : false;
		}
	}

}
