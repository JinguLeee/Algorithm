class Solution {
    public int solution(int n, int m, int[] section) {
        int len = 0;
        int count = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] > len) {
                len = section[i] + m - 1;
                count++;
            }
            if (len >= n) break; 
        }
        return count;
    }
}
