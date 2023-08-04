import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameMap = new HashMap<>();
        String[] numArr = new String[N+1];
        for (int i = 1; i <= N; i++) {
            numArr[i] = br.readLine();
            nameMap.put(numArr[i], i);
        }

        for (int i = 0; i < M; i++) {
            String answer = br.readLine();
            int num = nameMap.getOrDefault(answer, 0);

            if (num == 0) sb.append(numArr[Integer.parseInt(answer)] + "\n");
            else sb.append(num + "\n");
        }

        System.out.println(sb);
    }
}
