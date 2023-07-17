import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] num = new int[N+1][2];
        for (int i = 1; i <= N; i++) {
            num[i][0] = Integer.parseInt(br.readLine());
            num[i][1] = Integer.parseInt(br.readLine());
            num[0][0] = Math.max(num[0][0], num[i][0]);
            num[0][1] = Math.max(num[0][1], num[i][1]);
        }

        int[][] house = new int[num[0][0]+1][num[0][1]+2];
        for (int i = 1; i <= num[0][1]+1; i++) house[0][i] = i;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num[0][0]; i++) {
            int sum = 0;
            for (int j = 1; j <= num[0][1]+1; j++) {
                sum += house[i-1][j];
                house[i][j] = sum;
            }
        }

        for (int i = 1; i <= N; i++) sb.append(house[num[i][0]][num[i][1]] + "\n");
        System.out.println(sb);
    }
}