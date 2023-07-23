import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] dp = new int[N+1][M+1];

        for (int i = 1; i <= N; i++) {
            int coin = Integer.parseInt(br.readLine());
            dp[i][0] = 1;
            for (int j = 1; j <= M; j++) {
                if (j - coin < 0)  dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i-1][j] + dp[i][j - coin];
            }
        }
        System.out.println(dp[N][M]);
    }
}