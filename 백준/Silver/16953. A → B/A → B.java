import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        Map<Long, Integer> dp = new HashMap<>();
        Queue<Long> queue = new LinkedList<>();
        queue.add(A);
        dp.put(A, 1);
        while (!queue.isEmpty()) {
            long num = queue.poll();
            int count = dp.get(num) + 1;

            long a = num*2;
            long b = num*10+1;

            if (a == B || b == B) {
                dp.put(B, count);
                break;
            }

            if (!dp.containsKey(a) && a < B) {
                queue.add(a);
                dp.put(a, count);
            }

            if (!dp.containsKey(b) && b < B) {
                queue.add(b);
                dp.put(b, count);
            }
        }
        System.out.println(dp.getOrDefault(B, -1));
    }
}