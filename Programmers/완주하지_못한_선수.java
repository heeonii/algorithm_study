import java.util.HashMap;

public class 완주하지_못한_선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
		

	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap();
		for(String player : participant)
			map.put(player, map.getOrDefault(player, 0)+1);
		for(String player : completion)
			map.put(player, map.get(player)-1);
		
		for(String player : participant)
			if(map.get(player) > 0) {
				answer = player;
			}
		
		
		return answer;
	}

}
