import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append((deque.size() == 0 ? -1 : deque.pollFirst()) + "\n");
                    break;
                case "pop_back":
                    sb.append((deque.size() == 0 ? -1 : deque.pollLast()) + "\n");
                    break;
                case "size":
                    sb.append(deque.size() + "\n");
                    break;
                case "empty":
                    sb.append((deque.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    sb.append((deque.size() == 0 ? -1 : deque.getFirst()) + "\n");
                    break;
                case "back":
                    sb.append((deque.size() == 0 ? -1 : deque.getLast()) + "\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}