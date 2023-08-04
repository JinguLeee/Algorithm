import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue queue = new LinkedList();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            if (count % K == 0) sb.append(queue.poll() + ", ");
            else queue.add(queue.poll());
        }

        sb.delete(sb.length()-2, sb.length());
        System.out.println("<" + sb + ">");
    }
}