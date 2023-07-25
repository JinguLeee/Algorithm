import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] num = new int[N+1];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int dp[] = new int[N+1];
        for (int i = N-1; i >= 0; i--) {
            for (int j = N; j > i; j--) {
                if (num[i] > num[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}