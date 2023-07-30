import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        if (start == end) {
            System.out.println(0);
            return;
        }

        boolean[] visited = new boolean[100001];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;
        int size = 0;
        int count = 0;
        while (true) {
            size = queue.size();
            count++;
            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                if (num-1 == end || num+1 == end || num*2 == end) {
                    System.out.println(count);
                    return;
                }
                if (num-1 >= 0 && !visited[num-1]) {
                    queue.add(num-1);
                    visited[num-1] = true;
                }
                if (num+1 <= 100000 && !visited[num+1]) {
                    queue.add(num+1);
                    visited[num+1] = true;
                }
                if (num*2 <= 100000 && !visited[num*2]) {
                    queue.add(num*2);
                    visited[num*2] = true;
                }
            }
        }
    }
}