import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> deque;
        boolean first;
        boolean finish;
        for (int i = 0; i < N; i++) {
            deque = new ArrayDeque<>();
            first = true;
            finish = true;
            String function = br.readLine();
            int M = Integer.parseInt(br.readLine());

            String str = br.readLine();
            str = str.substring(1, str.length() - 1);
            st = new StringTokenizer(str, ",");

            for (int j = 0; j < M; j++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            for (int j = 0; j < function.length(); j++) {
                if (function.charAt(j) == 'R') {
                    first = !first;
                    continue;
                }

                if (deque.size() == 0) {
                    finish = false;
                    break;
                }

                if (first) deque.removeFirst();
                else deque.removeLast();
            }

            if (!finish) {
                sb.append("error" + "\n");
                continue;
            }

            sb.append("[");

            if (!deque.isEmpty()){
                if (first) {
                    sb.append(deque.pollFirst());
                    while (!deque.isEmpty()) {
                        sb.append("," + deque.pollFirst());
                    }
                } else {
                    sb.append(deque.pollLast());
                    while (!deque.isEmpty()) {
                        sb.append("," + deque.pollLast());
                    }
                }
            }
            sb.append("]\n");
        }

        System.out.println(sb);
    }
}