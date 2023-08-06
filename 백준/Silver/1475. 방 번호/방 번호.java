import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] count = new int[9];

        while (N > 0) {
            int remain = N % 10;
            if (remain == 9) count[6]++;
            else count[remain]++;
            N /= 10;
        }
        if (count[6] % 2 == 1) count[6]++;
        count[6] /= 2;
        
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, count[i]);
        }

        System.out.println(max);
    }
}