
public class 문자열_내_p와 {

	static class Solution {
		 static boolean solution(String s) {
			boolean answer = true;
			int cntY = 0; int cntP = 0;
			String[] array_py = s.toUpperCase().split("");

			for (int i = 0; i < array_py.length; i++) {
				//System.out.println(array_py[i]);
				if (array_py[i].charAt(0) == 'Y')
					cntY++;
				else if (array_py[i].charAt(0) == 'P')
					cntP++;
			}
			
			answer = (cntP == cntY) ? true : false;
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PyyypP";
		System.out.println(Solution.solution(s));

	}

}
