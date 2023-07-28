import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i = 0;
        int sum = 0;
        while (true) {
            if (sum + i + 1 >= N) break;
            sum += ++i;
        }
        int Q = i + 1;
        int R = N - sum;

        if (Q % 2 == 1) System.out.println(String.valueOf(Q-R+1) + "/" + String.valueOf(R));
        else System.out.println(String.valueOf(R) + "/" + String.valueOf(Q-R+1));
    }
}