import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < N; i++) {
            int a = 0; // 가로
            int b = 0; // 세로

            for (int j = 0; j < N; j++) {
                if (map[i][j] == '.') {
                    if (++a == 2) aCount++;
                } else a = 0;

                if (map[j][i] == '.') {
                    if (++b == 2) bCount++;
                } else b = 0;
            }
        }

        System.out.println(aCount + " " + bCount);
    }
}