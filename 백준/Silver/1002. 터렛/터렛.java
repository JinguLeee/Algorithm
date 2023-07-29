import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        Point point1;
        Point point2;
        int R1;
        int R2;
        double distance;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            point1 = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            R1 = Integer.parseInt(st.nextToken());
            point2 = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            R2 = Integer.parseInt(st.nextToken());

            if (R1 > R2) {
                Point point3 = point1.getLocation();
                point1 = point2.getLocation();
                point2 = point3.getLocation();
            }

            distance = Math.pow(point1.x - point2.x, 2);
            distance += Math.pow(point1.y - point2.y, 2);
            distance = Math.sqrt(distance);

            if (distance == 0) {    // 점이 겹쳐 있을 때
                if (R1 == R2) sb.append(-1 + "\n");
                else sb.append(0 + "\n");
            } else {
                if (Math.abs(R1-R2) < distance && distance < R1+R2) sb.append(2 + "\n");
                else if (Math.abs(R1-R2) == distance || distance == R1+R2) sb.append(1 + "\n");
                else sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
    }
}