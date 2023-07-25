import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[] check;
    static int node;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        StringTokenizer st;
        arr = new int[node+1][node+1];
        for (int i = 1; i <= line; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        check = new boolean[node+1];
        dfs(1);
        System.out.println(count - 1);
    }
    static void dfs(int num) {
        check[num] = true;
        count++;
        for (int i = 1; i <= node; i++) {
            if (!check[i] && arr[num][i] == 1) dfs(i);
        }
    }
}