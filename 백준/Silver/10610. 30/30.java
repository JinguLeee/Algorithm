import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int sum = 0;
        int[] count = new int[10];
        for (int i = 0; i < N.length(); i++) {
            int num = Integer.parseInt(N.substring(i, i+1));
            count[num]++;
            sum += num;
        }

        String str = "";
        if (count[0] == 0 || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 9; i >= 0; i--) {
            str += String.valueOf(i).repeat(count[i]);
        }
        System.out.println(str);
    }
}