import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine(), " ");
            int yLength = Integer.parseInt(st.nextToken());
            int xLength = Integer.parseInt(st.nextToken());
            int line = Integer.parseInt(st.nextToken());

            arr = new int[xLength+2][yLength+2];
            for (int i = 0; i < line; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                arr[x+1][y+1] = 1;
            }

            int count = 0;
            for (int i = 1; i <= xLength; i++) {
                for (int j = 1; j <= yLength; j++) {
                    if (arr[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            if (n > 0) sb.append("\n");
            sb.append(count);
        }
        System.out.println(sb);
    }
    static void dfs(int i, int j) {
        arr[i][j] = 0;
        for (int k = 0; k < 4; k++) {
            if (arr[i+dx[k]][j+dy[k]] == 1) dfs(i+dx[k], j+dy[k]);
        }
    }
}