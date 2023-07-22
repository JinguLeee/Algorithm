import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N+1][10];
        dp[1] = new long[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) dp[i][j] = dp[i-1][1];
                else if (j == 9) dp[i][j] = dp[i-1][8];
                else dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
            }
        }
        long sum = 0;
        for (int j = 0; j <= 9; j++) {
            sum += dp[N][j];
        }
        System.out.println(sum % 1000000000);
    }
}