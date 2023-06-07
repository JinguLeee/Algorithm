class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            int indexAt = alphabet.indexOf(charAt);

            for (int j = 0; j < index; j++) {
                indexAt = indexAt > 24 ? indexAt - 25 : indexAt + 1;
                charAt = alphabet.charAt(indexAt);
                if (skip.contains("" + charAt)) j--;
            }
            answer += charAt;
        }
        return answer;
    }
}