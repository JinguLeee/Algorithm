import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }


        int[] dp = new int[N+1];
        dp[1] = num[1];
        if (N > 1) dp[2] = num[1] + num[2];
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-3] + num[i-1], dp[i-2]) + num[i]);
        }

        System.out.println(dp[N]);
    }
}