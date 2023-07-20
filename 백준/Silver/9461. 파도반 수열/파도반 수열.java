import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = 0;
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, num[i]);
        }

        Long[] dp = new Long[max+1];
        dp[1] = 1L;
        if (max > 1) dp[2] = 1L;
        if (max > 2) dp[3] = 1L;
        for (int i = 4; i <= max; i++) {
            dp[i] = dp[i-3] + dp[i-2];
        }

        for (int i = 0; i < N; i++) {
            System.out.println(dp[num[i]]);
        }
    }
}