class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            int an = 0;
            for (int j = i-1; j >= 0; j--) {
                if (str == s.charAt(j)) {
                    an = i-j;
                    break;
                }
            }
            answer[i] = (an == 0 ? -1 : an);
        }
        return answer;
    }
}