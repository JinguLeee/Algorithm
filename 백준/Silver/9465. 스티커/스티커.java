import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            int[][] dp = new int[2][M+1];

            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            dp[0][1] = Integer.parseInt(st1.nextToken());
            dp[1][1] = Integer.parseInt(st2.nextToken());

            for (int j = 2; j <= M; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + Integer.parseInt(st1.nextToken());
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + Integer.parseInt(st2.nextToken());
            }
            System.out.println(Math.max(dp[0][M], dp[1][M]));
        }
    }
}