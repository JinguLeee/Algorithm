import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        final int INF = 100000000;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            Arrays.fill(arr[i], INF);
            arr[i][i] = 0;
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        // 플로이드 와샬
        for (int k = 1; k <= N; k++) // 거쳐가는 노드
            for (int i = 1; i <= N; i++) { // 시작 노드
                for (int j = 1; j <= N; j++) // 도착 노드
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
            }

        int node = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= N; j++)
                sum += arr[i][j];

            if (sum < min) {
                node = i;
                min = sum;
            }
        }

        System.out.println(node);
    }
}
