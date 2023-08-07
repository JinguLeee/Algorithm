import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        int minBirth = Integer.MAX_VALUE;
        String minName = null;
        int maxBirth = 0;
        String maxName = null;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String Name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            day += Integer.parseInt(st.nextToken()) * 100;
            day += Integer.parseInt(st.nextToken()) * 10000;

            if (minBirth > day) {
                minBirth = day;
                minName = Name;
            }
            if (maxBirth < day) {
                maxBirth = day;
                maxName = Name;
            }
        }

        System.out.println(maxName + "\n" + minName);
    }
}