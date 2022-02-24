
public class 완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(Solution.solution(participant, completion));


	}
	
	static class Solution {
		 public static String solution(String[] participant, String[] completion) {
		        String answer = "";
		        
		        String temp = participant[0];
			    int count = 0;  
			        for(int i = 0 ; i < participant.length ; i++){
			            for(int j = 0 ; j < completion.length ; j++) {
			            	if(participant[i] == completion[j]) {
			            		count++;
			            	}
			            	
			            }
			            if(count == 0) {
		        			temp = participant[i];
		        		}
			            count = 0;
			        }
			        answer = temp;

		        return answer;
		    }
		
	}

}
