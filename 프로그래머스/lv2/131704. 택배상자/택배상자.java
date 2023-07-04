import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int index = 1;
        Stack<Integer> stack = new Stack<>();

        for (int num : order) {
            if (stack.size() > 0 && stack.peek() == num) {
                stack.pop();
                answer++;
                continue;
            }

            for (;index <= order.length; index++) {
                if (index != num) {
                    if (index == order.length) return answer;
                    stack.push(index);
                } else {
                    answer++;
                    index++;
                    break;
                }
            }
        }
        return answer;
    }
}