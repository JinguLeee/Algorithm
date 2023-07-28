import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int day = 1;
        int height = Integer.parseInt(st.nextToken());
        int up = height - Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken()) - height;
        day += height / up;
        if (height % up > 0) day++;

        System.out.println(day);
    }
}