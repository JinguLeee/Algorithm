class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            String substr = code.substring(i, i+1);
            if (substr.equals("1")) {
                mode = !mode;
                continue;
            }
            if (mode == false && i % 2 == 0 || mode == true && i % 2 == 1) answer += substr;
        }
        return answer.equals("") ? "EMPTY" : answer;
    }
}