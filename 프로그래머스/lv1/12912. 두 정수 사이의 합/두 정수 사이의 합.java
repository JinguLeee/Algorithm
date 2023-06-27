class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) for (; a<= b; a++) answer += a;
        else for (; a >= b; a--) answer += a;
        
        return answer;
    }
}