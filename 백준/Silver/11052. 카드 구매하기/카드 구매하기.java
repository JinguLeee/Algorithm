import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N+1][N+1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 1; i <= N; i++) {
            int price = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= N; j++) {
                if (j-i < 0) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.max(dp[i-1][j], price + dp[i][j-i]);
            }
        }
        System.out.println(dp[N][N]);
    }
}