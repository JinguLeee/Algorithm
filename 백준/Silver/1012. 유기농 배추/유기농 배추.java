import java.awt.*;
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
                        bfs(i, j);
                        count++;
                    }
                }
            }
            if (n > 0) sb.append("\n");
            sb.append(count);
        }
        System.out.println(sb);
    }
    static void bfs(int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i, j));
        arr[i][j] = 0;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int k = 0; k < 4; k++) {
                if (arr[point.x+dx[k]][point.y + dy[k]] == 1) {
                    arr[point.x+dx[k]][point.y + dy[k]] = 0;
                    queue.add(new Point(point.x+dx[k], point.y + dy[k]));
                }
            }
        }
    }
}