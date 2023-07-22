import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] count = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            count[i][0] = Integer.parseInt(st.nextToken());
            count[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];
        for (int i = N-1; i >= 0; i--) {
            if (i + count[i][0] > N) dp[i] = dp[i+1];
            else dp[i] = Math.max(dp[i+1], dp[i+count[i][0]] + count[i][1]);
        }

        System.out.println(dp[0]);
    }
}