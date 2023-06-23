import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();
        int[] YArray = new int[board.length];

        for (int i = 0; i < moves.length; i++) {
            int X = moves[i]-1;
            int Y = YArray[X];
            for (int j = Y; j < board.length; j++) {
                int num = board[j][X];
                if (num == 0) continue;
                int size = basket.size() - 1;
                if (size >= 0 && basket.get(size) == num) {
                    basket.remove(size);
                    answer += 2;
                }
                else basket.add(num);
                YArray[X] = j + 1;
                board[j][X] = 0;
                break;
            }
        }
        return answer;
    }
}