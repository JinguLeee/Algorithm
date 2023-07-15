import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPq = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) maxPq.offer(Integer.parseInt(br.readLine()));
            else minPq.offer(Integer.parseInt(br.readLine()));

            if (!minPq.isEmpty() && maxPq.peek() > minPq.peek()) {
                maxPq.offer(minPq.poll());
                minPq.offer(maxPq.poll());
            }
            sb.append(maxPq.peek()).append("\n");
        }
        System.out.println(sb);
    }
}