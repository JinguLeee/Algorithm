import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        int count = 0;
        int sum = 0;
        for (int i = 0; i < M - (2*N); i++) {
            if (chars[i] != 'I') continue;

            while (i < M - 2) {
                if (chars[++i] == 'O' && chars[++i] == 'I') {
                    count++;
                } else {
                    i--;
                    break;
                }
            }

            if (count - N + 1 > 0) sum += count - N + 1;
            count = 0;
        }
        System.out.println(sum);
    }
}