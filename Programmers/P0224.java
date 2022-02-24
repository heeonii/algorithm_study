package dqy15_Network;

//import java.util.ArrayList;
import java.util.Arrays;

public class P0224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
		System.out.println(Solution.solution(A, B));

	}

	static class Solution {
		public static int solution(int[] A, int[] B) {
			int answer = 0;
			
			//ArrayList<Integer> listA = new ArrayList<>();
			//ArrayList<Integer> listB = new ArrayList<>();
			Arrays.sort(A);
			Arrays.sort(B);
			
			for (int i = 0; i < A.length; i++) {
				answer += A[i] * B[A.length-i-1];
			}

			return answer;
		}
	}

}
