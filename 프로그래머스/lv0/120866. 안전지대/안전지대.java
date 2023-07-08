class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = (i-1 < 0? 0 : i-1); k <= (i == board.length - 1 ? i : i+1); k++) {
                        for (int l = (j-1 < 0? 0 : j-1); l <= (j == board.length - 1 ? j : j+1); l++) {
                            if (board[k][l] == 0)  board[k][l] = 2;
                        }   
                    }
                }
            }
        }
        for (int[] ints : board) {
            for (int anInt : ints) {
                if (anInt == 0) answer++;
            }
        }
        return answer;
    }
}