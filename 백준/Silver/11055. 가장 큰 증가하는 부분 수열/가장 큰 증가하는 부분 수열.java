import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] num = new int[N+1];
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] > num[j]) dp[i] = Math.max(dp[i], dp[j] + num[i]);
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}