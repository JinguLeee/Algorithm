import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    
    static int X;
    static int Y;
    static int N;
    
	static boolean[][] arr;
	static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        
        arr = new boolean[X+1][Y+1];
        visited = new boolean[X+1][Y+1];
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            arr[a][b] = true;
        }
        
        int count = 0;
        for (int i = 1; i <= X; i++) {
        	for (int j = 1; j <= Y; j++) {
        		if (!arr[i][j] || visited[i][j]) continue;
        		count = Math.max(count, dfs(i, j)+1);
        	}
        }
        
        System.out.print(count);
    }
	
	static int dfs(int a, int b) {
		visited[a][b] = true;
		int count = 0;
		for (int i = 0; i < 4; i ++) {
			int x = a + dx[i];
			int y = b + dy[i];
			if (x < 1 || y < 1 || x > X || y > Y) continue;
			if (arr[x][y] && !visited[x][y]) count += dfs(x, y) + 1;
		}
		return count;
	}
}