import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        boolean[] num = new boolean[max+1];
        Arrays.fill(num, true);
        num[0] = false;
        num[1] = false;

        for (int i = 2; i*i <= max; i++) {
            for (int j = 2; i*j <= max; j++) {
                num[i*j] = false;
            }
        }

        for (int i = min; i <= max; i++) {
            if (num[i]) sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}