import java.util.ArrayList;
import java.util.List;

public class Æ÷ÄÏ¸ó {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3,3,2,2,2};
		System.out.println(solution(nums));

	}

	public static int solution(int[] nums) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(!list.contains(nums[i]))
				list.add(nums[i]);
		}
		
		int N = nums.length/2;
		answer = N >= list.size()? list.size():N;
		
		return answer;
	}

}
