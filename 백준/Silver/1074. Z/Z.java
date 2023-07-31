import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[][] intZ = {{0, 1}, {2, 3}};

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = 0;

        while (N >= 2) {
            int pow = (int) Math.pow(Math.pow(2, N-1), 2);
            int mid = (int) Math.pow(2, N) / 2;
            if (r < mid && c >= mid) {
                c -= mid;
                sum += pow;
            } else if (r >= mid && c < mid) {
                r -= mid;
                sum += pow*2;
            } else if (r >= mid && c >= mid) {
                c -= mid;
                r -= mid;
                sum += pow * 3;
            }
            N--;
        }

        System.out.println(sum + intZ[r][c]);
    }
}
