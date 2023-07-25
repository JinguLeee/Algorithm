import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] arr;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int xLength = Integer.parseInt(st.nextToken());
        int yLength = Integer.parseInt(st.nextToken());
        arr = new int[xLength+2][yLength+2];
        for (int i = 1; i <= xLength; i++) {
            String str = br.readLine();
            for (int j = 1; j <= yLength; j++) {
                arr[i][j] = Integer.parseInt(str.substring(j-1, j));
            }
        }

        dp = new int[xLength+2][yLength+2];
        bfs(1, 1);
        System.out.println(dp[xLength][yLength]);
    }
    static void bfs(int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i, j));
        arr[i][j] = 0;
        dp[i][j] = 1;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int k = 0; k < 4; k++) {
                if (arr[point.x+dx[k]][point.y + dy[k]] == 1) {
                    arr[point.x+dx[k]][point.y + dy[k]] = 0;
                    dp[point.x+dx[k]][point.y + dy[k]] = dp[point.x][point.y] + 1;
                    queue.add(new Point(point.x+dx[k], point.y + dy[k]));
                }
            }
        }
    }
}