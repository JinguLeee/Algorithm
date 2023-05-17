class Solution {
    public int solution(int[][] sizes) {
        int sMax = 0;
        int lMax = 0;
        for (int i = 0; i < sizes.length; i++){
            if (sizes[i][0] > sizes[i][1]) {
                if (sMax < sizes[i][1]) sMax = sizes[i][1];
                if (lMax < sizes[i][0]) lMax = sizes[i][0];
            } else {
                if (sMax < sizes[i][0]) sMax = sizes[i][0];
                if (lMax < sizes[i][1]) lMax = sizes[i][1];
            }
        }
        return sMax*lMax;
    }
}