import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        HashSet<Integer> number = new HashSet<>();
        number.add(a);
        number.add(b);
        number.add(c);

        int answer = 0;
        if (number.size() == 3) answer = a + b + c;
        else if (number.size() == 2) answer = (a + b + c) * (a*a + b*b + c*c);
        else answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);

        return answer;
    }
}