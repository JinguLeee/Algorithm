import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            sb.append(check(str) + "\n");
        }

        System.out.println(sb);
    }
    public static String check(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char type = str.charAt(i);
            switch (type) {
                case '(' :
                case '[':
                    stack.push(type);
                    break;
                case ')' :
                case ']':
                    if (stack.size() == 0) return "no";
                    char type2 = stack.pop();
                    if (type2 == '(' && type == ')' || type2 == '[' && type == ']') continue;
                    return "no";
            }
        }
        return (stack.isEmpty() ? "yes" : "no");
    }
}