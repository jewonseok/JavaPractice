package programmers;

public class GreatestCommonFactor {
    public int[] solution(int n, int m) {
        int x = Math.max(n,m);
        int y = Math.min(n,m);
        
        while(y != 0) {
            int z = x % y;
            x = y;
            y = z;
        } // 최대공약수
        
        int u = n * m / x; // 최소공배수
        int[] answer = {x, u};
        return answer;
    }
}