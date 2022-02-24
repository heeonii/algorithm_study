import java.util.*;

public class 모의고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solution(answers)));

	}

	public static int[] solution(int[] answers) {
	
		int n = answers.length;
		//int[] answer = {};
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] cnt = {0, 0, 0};
		
		
		for (int i = 0; i < n; i++) {
			if(arr1[i % arr1.length] == answers[i]) cnt[0]++;
			if(arr2[i % arr2.length] == answers[i]) cnt[1]++;
			if(arr3[i % arr3.length] == answers[i]) cnt[2]++;
		}
		
		int max = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
		//Arrays.sort(cnt);
		System.out.println(cnt[0]);
		System.out.println(cnt[1]);
		System.out.println(cnt[2]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < cnt.length; i++) {
			if (max == cnt[i]) list.add(i+1);
		}
		
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
	

		return answer;
	}

}
