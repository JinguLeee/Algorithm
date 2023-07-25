import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int node;
    static int[][] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];
        for (int i = 1; i <= line; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        check = new boolean[node + 1];
        dfs(start);
        sb.append("\n");

        check = new boolean[node + 1];
        bfs(start);
        System.out.println(sb);
    }

    public static void dfs(int num) {
        sb.append(num + " ");
        check[num] = true;

        for (int i = 1; i <= node; i++) {
            if (!check[i] && arr[num][i] == 1) dfs(i);
        }
    }

    public static void bfs(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);
        check[num] = true;

        while (!queue.isEmpty()) {
            int p = queue.poll();
            sb.append(p + " ");
            for (int i = 1; i <= node; i++) {
                if (!check[i] && arr[p][i] == 1) {
                    queue.add(i);
                    check[i] = true;
                }
            }
        }
    }
}