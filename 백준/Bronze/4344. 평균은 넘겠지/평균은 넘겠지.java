import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int count = Integer.parseInt(st.nextToken());   // 전체 count

            int sum = 0;
            int[] score = new int[count];
            for (int j = 0; j < count; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }

            double avg = sum / count;
            double avgCount = 0;   // 평균을 넘는 count
            for (int j = 0; j < count; j++) {
                if (score[j] > avg) avgCount++;
            }
            
            if (i > 0) sb.append("\n");
            sb.append(String.format("%.3f", avgCount/count*100) + "%");
        }
        System.out.println(sb);
    }
}