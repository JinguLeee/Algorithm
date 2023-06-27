import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int [arr.length];
        int num = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] % divisor == 0) answer[num++] = arr[i] ;
        Arrays.sort(answer);
        int[] cArr = Arrays.copyOfRange(answer, arr.length - num, answer.length);
        if (cArr.length == 0) cArr = new int[] {-1};
        return cArr;
    }
}