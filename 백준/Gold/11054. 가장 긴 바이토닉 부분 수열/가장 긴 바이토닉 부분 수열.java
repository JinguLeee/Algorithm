import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] num = new int[N+2];
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[2][N+2];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] > num[j]) dp[0][i] = Math.max(dp[0][i], dp[0][j] + 1);
            }
        }
        for (int i = N; i > 0; i--) {
            for (int j = N+1; j >= i+1; j--) {
                if (num[i] > num[j]) dp[1][i] = Math.max(dp[1][i], dp[1][j] + 1);
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp[0][i] + dp[1][i]);
        }
        System.out.println(max - 1);
    }
}