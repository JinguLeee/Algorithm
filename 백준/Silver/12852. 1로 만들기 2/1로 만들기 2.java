import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int[] dp = new int[X+1];
        String[] arr = new String[X+1];
        arr[1] = "1";
        
        for (int i = 2; i <= X; i++) {
        	dp[i] = dp[i-1] + 1;
        	arr[i] = i + " " + arr[i-1];
            if (i % 3 == 0 && dp[i] > dp[i/3] + 1) {
            	dp[i] = dp[i/3] + 1;
            	arr[i] = i + " " + arr[i/3];
            }
            if (i % 2 == 0 && dp[i] > dp[i/2] + 1) {
            	dp[i] = dp[i/2] + 1;
            	arr[i] = i + " " + arr[i/2];
            }
        }

        System.out.println(dp[X] + "\n" + arr[X]);
    }
}