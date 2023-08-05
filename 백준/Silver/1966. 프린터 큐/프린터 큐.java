import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue;
        Queue<int[]> queue;

        for (int i = 0; i < N; i++) {
            priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                priorityQueue.add(num);
                queue.add(new int[] {j, num});
            }

            int count = 0;
            while (true) {
                int[] num = queue.poll();
                if (num[1] < priorityQueue.peek()) {
                    queue.add(num);
                } else {
                    priorityQueue.poll();
                    count++;
                    if (num[0] == index) break;
                }
            }
            sb.append(count + "\n");
        }

        System.out.println(sb);
    }
}