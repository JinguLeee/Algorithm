import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] grade = new int[N];
        Arrays.fill(grade, 1);
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) grade[i]++;
            }
        }

        for (int i : grade) sb.append(i + " ");
        System.out.println(sb);
    }
}