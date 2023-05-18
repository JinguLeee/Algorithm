using System;

public class Solution {
    public int solution(int n) {
        int i = 2;
        for (; i <= n; i++) {
            if (n%i == 1) break;
        }
        return i;
    }
}