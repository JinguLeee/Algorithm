import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int dp[] = new int[N+1];
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j*j <= i; j++) {
                if (j == 1) dp[i] = dp[i-1] + 1;
                else dp[i] = Math.min(dp[i-j*j] + 1, dp[i]);
            }
        }

        System.out.println(dp[N]);
    }
}