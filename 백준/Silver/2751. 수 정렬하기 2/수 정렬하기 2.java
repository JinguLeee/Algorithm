import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ints);
        for (int i = 0; i < N; i++) {
            sb.append(ints[i] + "\n");
        }
        System.out.println(sb);
    }
}