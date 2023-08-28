import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        final int MOD = 1_000_000_009;
        int N = Integer.parseInt(br.readLine());
        int M;
        long[] dp;
        for (int i = 0; i < N; i++) {
        	M = Integer.parseInt(br.readLine());
        	dp = new long[M+1];
            dp[0] = dp[1] = 1;
            if (M >= 2) dp[2] = 2;
            
            for (int j = 3; j <= M; j++) {
            	dp[j] = (dp[j-1] + dp[j-2] + dp[j-3]) % MOD;
            }
            sb.append(dp[M] + "\n");
        }
        System.out.println(sb);
    }
}