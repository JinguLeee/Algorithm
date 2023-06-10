class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char target = control.charAt(i);
            if (target == 'w') n++;
            else if (target == 's') n--;
            else if (target == 'd') n += 10;
            else n -= 10;
        }
        return n;
    }
}