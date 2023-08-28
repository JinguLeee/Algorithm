import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    static int[][] dp;
    static int xLength;
    static int yLength;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        xLength = Integer.parseInt(st.nextToken());
        yLength = Integer.parseInt(st.nextToken());
        arr = new int[xLength][yLength];
        dp = new int[xLength][yLength];
        for (int i = 0; i < xLength; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < yLength; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        System.out.println(dfs(0, 0));
    }
    static int dfs(int x, int y) {
        if (x == xLength-1 && y == yLength-1) return 1;
        if(dp[x][y] > -1) return dp[x][y];
        
        dp[x][y] = 0;
        for (int k = 0; k < 4; k++) {
        	int nx = x+dx[k];
        	int ny = y+dy[k];

        	if (nx < 0 || ny < 0 || nx >= xLength || ny >= yLength) continue;

            if (arr[x][y] > arr[nx][ny]) dp[x][y] += dfs(nx, ny);
        }
        return dp[x][y];
    }
}