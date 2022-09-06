package programmers;

public class MinimumDelete {
	class Solution {
	    public int[] solution(int[] arr) {
	        if(arr.length == 1) {
	            int[] answer = new int[1];
	            answer[0] = -1;
	            return answer;
	        }    //배열 길이가 1인 경우 -1 반환
	        else {
	            int[] answer = new int[arr.length - 1];
	            int min = arr[0];
	            
	            for(int i = 0; i<arr.length; i++) {
	                min = Math.min(min,arr[i]);//가장 작은 수
	            }
	            
	            int index = 0;
	            for(int i = 0; i<arr.length; i++) {
	                if(min == arr[i]) {
	                    continue;
	                }
	                
	                answer[index] = arr[i];
	                index ++;
	            }
	            return answer;
	        }
	    }
	}
}
