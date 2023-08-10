import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> number = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            number.add(Integer.parseInt(st.nextToken()));
        }


        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            if (number.contains(Integer.parseInt(st.nextToken()))) sb.append(1 + "\n");
            else sb.append(0 + "\n");
        }

        System.out.println(sb);
    }
}