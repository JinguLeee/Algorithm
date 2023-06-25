class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sArray = s.toCharArray();
        int i = s.length();
        if (i % 2 == 1) {
            return "" + sArray[i/2];
        } else {
            return "" + sArray[i/2 - 1] + sArray[i/2];
        }
    }
}
