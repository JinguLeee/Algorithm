import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int[] x = {1, -1, 0, 0};
    static int[] y = {0, 0, 1, -1};
    static int[][] arr;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N +2][N +2];
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(str.substring(j-1, j));
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] == 1) {
                    count = 0;
                    bfs(i, j);
                    pq.add(count);
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        int size = pq.size();
        sb.append(size);

        for (int i = 0; i < size; i++) {
            sb.append("\n" + pq.poll());
        }
        System.out.println(sb);
    }
    static void bfs(int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i, j));
        arr[i][j] = 0;
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            count++;
            for (int k = 0; k < 4; k++) {
                if (arr[p.x + x[k]][p.y + y[k]] == 1) {
                    arr[p.x + x[k]][p.y + y[k]] = 0;
                    queue.add(new Point(p.x + x[k], p.y + y[k]));
                }
            }
        }
    }
}