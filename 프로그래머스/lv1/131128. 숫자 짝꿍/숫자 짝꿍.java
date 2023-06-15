class Solution {
    public String solution(String X, String Y) {
        int[] XArray = new int[10];
        int[] YArray = new int[10];

        for (String x : X.split("")) {
            XArray[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            YArray[Integer.parseInt(y)]++;
        }

        String answer = "";
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(XArray[i], YArray[i]);
            if (min > 0) answer += (String.valueOf(i)).repeat(min);
        }

        if (answer.equals("")) return "-1";
        if (answer.substring(0,1).equals("0")) return "0";
        return answer;
    }
}
