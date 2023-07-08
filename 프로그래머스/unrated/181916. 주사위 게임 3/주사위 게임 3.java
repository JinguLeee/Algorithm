import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        numMap.put(a, 1);
        numMap.put(b, numMap.getOrDefault(b, 0) + 1);
        numMap.put(c, numMap.getOrDefault(c, 0) + 1);
        numMap.put(d, numMap.getOrDefault(d, 0) + 1);

        int e = 1, f = 1;
        switch (numMap.size()) {
            case 1:
                return 1111 * a;
            case 2:
                if (numMap.get(a) == 2) {
                    b = (a == b ? (a == c ? d : c) : b);
                    return (a + b) * (a - b > 0 ? a - b : b - a);
                }

                for (Integer integer : numMap.keySet()) {
                    if (numMap.get(integer) == 1) e = integer;
                    else f = integer;
                }
                return (int) Math.pow((10 * f + e), 2);
            case 3:
                for (Integer integer : numMap.keySet()) {
                    if (numMap.get(integer) != 2) {
                        e *= integer;
                    }
                }
                return e;
            default:
                e = a;
                for (Integer integer : numMap.keySet()) {
                    if (e > integer) e = integer;
                }
                return e;
        }
    }
}