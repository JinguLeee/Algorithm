class Solution {
    public int solution(String s) {
        int x = 0;
        int y = 0;
        char c = 'A';
        boolean start = false;
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (start == false) {
                c = s.charAt(i);
                start = true;
                x++;
            }
            else if (c == s.charAt(i)) x++;
            else y++;

            if (x == y) {
                x = 0;
                y = 0;
                start = false;
                answer++;
            }
        }
        
        if (x != 0 || y != 0) answer++;
        return answer;
    }
}