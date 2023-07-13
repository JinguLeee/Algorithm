class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            if (s.contains("ayaaya") || s.contains("yeye") || 
                s.contains("woowoo") || s.contains("mama")) continue; 
            s = s.replace("aya", " ");
            s = s.replace("ye", " ");
            s = s.replace("woo", " ");
            s = s.replace("ma", " ");
            s = s.replace(" ", "");
            if (s.isEmpty()) answer++;
        }
        return answer;
    }
}