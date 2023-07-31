import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        int count = 0;
        List<Integer> countList = new ArrayList<>();
        for (int i = 0; i <= M; i++) {
            if (count == 0 && chars[i] != 'I') continue;

            if (i != M && (count == 0 && chars[i] == 'I' || chars[i] != chars[i-1])) {
                count++;
            } else {
                if (chars[(i == M ? i-1 : i)] != 'I') count--;
                if (count >= 2*N+1) countList.add(count);
                count = 1;
            }
        }

        int sum = 0;
        for (Integer integer : countList) {
            sum += (integer - (2*N+1)) / 2 + 1;
        }
        System.out.println(sum);
    }
}