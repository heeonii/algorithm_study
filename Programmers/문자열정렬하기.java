import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		System.out.println(Arrays.toString(Solution.solution(strings, n)));

	}

	static class Solution {
		public static String[] solution(String[] strings, int n) {
			String[] answer = new String[strings.length];
			ArrayList<String> list = new ArrayList<String>();
			
			for (int i = 0 ; i < strings.length; i++) {
				list.add(strings[i].charAt(n) + strings[i]);
			}
			
			Collections.sort(list);
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i).substring(1);
			}
			
			
			return answer;
		}
	}

}
