import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(check(br.readLine()) + "\n");
        }

        System.out.println(sb);
    }

    public static String check(String str) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '(') stack.push('(');
            else {
                if (stack.size() == 0) return "NO";
                else stack.pop();
            }
        }
        return (stack.isEmpty() ? "YES" : "NO");
    }
}