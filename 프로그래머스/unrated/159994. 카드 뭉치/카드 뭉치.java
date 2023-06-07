class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;
        
        for (int i = 0; i < goal.length; i++) {
            if (cards1.length > index1 && cards1[index1].equals(goal[i])) {
                index1++;
                continue;
            }
            else if (cards2.length > index2 && cards2[index2].equals(goal[i])) {
                index2++;
                continue;
            }
            else return "No";
        }
        return "Yes";
    }
}