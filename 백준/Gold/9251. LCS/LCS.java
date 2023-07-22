import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] NArr = br.readLine().toCharArray();
        char[] MArr = br.readLine().toCharArray();

        int[][] dp = new int[MArr.length+1][NArr.length+1];
        for (int i = 1; i <= MArr.length; i++) {
            for (int j = 1; j <= NArr.length; j++) {
                if (MArr[i-1] == NArr[j-1]) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }

        System.out.println(dp[MArr.length][NArr.length]);
    }
}