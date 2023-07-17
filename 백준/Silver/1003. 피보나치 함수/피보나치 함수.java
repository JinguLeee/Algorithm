import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, num[i]);
        }

        max = (max < 1 ? 1 : max);
        int[][] dp = new int[max+1][2];
        dp[0] = new int[] {1, 0};
        dp[1] = new int[] {0, 1};
        for (int i = 2; i <= max; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(dp[num[i]][0] + " " + dp[num[i]][1] + "\n");
        }
        System.out.println(sb);
    }
}