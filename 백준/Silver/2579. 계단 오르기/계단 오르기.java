import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];
        int[] stair = new int[N+1];

        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stair[1];
        if (N > 1) dp[2] = stair[1] + stair[2];
        if (N > 2) dp[3] = Math.max(stair[1], stair[2]) + stair[3];

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(stair[i-1] + dp[i-3], dp[i-2]) + stair[i];
        }

        System.out.println(dp[N]);
    }
}