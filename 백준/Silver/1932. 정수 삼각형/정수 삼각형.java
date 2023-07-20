import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N+1][N+2];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + Integer.parseInt(st.nextToken());;
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            if (max < dp[N][i]) max = dp[N][i];
        }
        System.out.println(max);
    }
}