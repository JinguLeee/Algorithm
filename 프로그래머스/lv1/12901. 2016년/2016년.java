class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int day = 0;
        for (int i = 0; i < a - 1; i++) day += month[i];
        day += b;
        
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        return week[day%7];
    }
}