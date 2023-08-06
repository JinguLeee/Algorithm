import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int[] count = new int[9];
        for (int i = 0; i < N.length(); i++) {
            int num = Character.getNumericValue(N.charAt(i));
            if (num == 9) count[6]++;
            else count[num]++;
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