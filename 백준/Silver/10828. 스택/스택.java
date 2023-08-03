import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String calculate = st.nextToken();
            switch (calculate) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append((stack.isEmpty() ? -1 : stack.pop()) + "\n");
                    break;
                case "size":
                    sb.append(stack.size() + "\n");
                    break;
                case "empty":
                    sb.append((stack.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "top":
                    sb.append((stack.isEmpty() ? -1 : stack.peek()) + "\n");
                    break;
            }

        }
        System.out.println(sb);
    }
}