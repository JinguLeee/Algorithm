import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        if (start == end) {
            System.out.println(0);
            return;
        }

        boolean[] visited = new boolean[100001];
        int[] dp = new int[100001];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;
        while (true) {
            int num = queue.poll();
            if (num-1 == end || num+1 == end || num*2 == end) {
                System.out.println(dp[num]+1);
                return;
            }
            if (num-1 >= 0 && !visited[num-1]) {
                queue.add(num-1);
                visited[num-1] = true;
                dp[num-1] = dp[num]+1;
            }
            if (num+1 <= 100000 && !visited[num+1]) {
                queue.add(num+1);
                visited[num+1] = true;
                dp[num+1] = dp[num]+1;
            }
            if (num*2 <= 100000 && !visited[num*2]) {
                queue.add(num*2);
                visited[num*2] = true;
                dp[num*2] = dp[num]+1;
            }
        }
    }
}