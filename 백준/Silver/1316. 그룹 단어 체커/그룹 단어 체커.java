import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[] charArr = br.readLine().toCharArray();
            List<Character> existList = new ArrayList<>();
            boolean isEnable = true;
            existList.add(charArr[0]);
            for (int j = 1; j < charArr.length; j++) {
                if (charArr[j-1] == charArr[j]) continue;
                if (existList.contains(charArr[j])) {
                    isEnable = false;
                    break;
                }
                existList.add(charArr[j]);
            }
            if (isEnable) count++;
        }

        System.out.println(count);
    }
}