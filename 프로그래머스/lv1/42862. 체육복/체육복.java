import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] clothes = new int[n];
        for (int i : lost) {
            clothes[i-1]--;
        }
        for (int i : reserve) {
            clothes[i-1]++;
        }

        for (int i = 0; i < n; i++)  {
            if (clothes[i] == -1) {
                if (i > 0 && clothes[i-1] == 1) {
                    clothes[i-1]--;
                    clothes[i]++;
                } else if (i < n-1 && clothes[i+1] == 1) {
                    clothes[i+1]--;
                    clothes[i]++;
                }
                else answer--;
            }
        }

        return answer;
    }
}