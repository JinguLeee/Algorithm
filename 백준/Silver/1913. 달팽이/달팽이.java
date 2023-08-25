import java.io.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        
        int x = -1;
        int y = 0;
        
        int ax = 0;
        int ay = 0;
        
        int d = 0;	// 방향
        int num = N*N;
        int count = N;
        int index = 0; // count까지 도달할 수

        while (true) {
        	x += dx[d];
        	y += dy[d];

        	arr[x][y] = num;
        	if (M == num--) {
        		ax = x;
        		ay = y;
        	}
        	if (num == 0) break;
        	
        	if (++index == count) {
        		d++;
        		if (d == 4) d = 0;
        		if (d == 1 || d == 3) count--;
        		index = 0;
        	}
        }
        
        for (int i = 0; i < N; i++) {
        	for (int j = 0; j < N; j++) {
        		sb.append(arr[i][j] + " ");
        	}
        	sb.append("\n");
        }
        sb.append((ax+1) + " " + (ay+1));
        System.out.println(sb);
    }
}