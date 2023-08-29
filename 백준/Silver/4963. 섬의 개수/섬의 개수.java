import java.awt.Point;
import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    
    static int X;
    static int Y;
    
	static int[][] arr;
	static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        while (true) {
        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
        	Y = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            if (Y == 0 && X == 0) break;
            arr = new int[X][Y];
            
            for (int i = 0; i < X; i++) {
            	st = new StringTokenizer(br.readLine()," ");
            	for (int j = 0; j < Y; j++) {
            		arr[i][j] = Integer.parseInt(st.nextToken());
            	}
            }
            
            visited = new boolean[X][Y];
            int count = 0;
            for (int i = 0; i < X; i++) {
            	for (int j = 0; j < Y; j++) {
            		if (visited[i][j] || arr[i][j] == 0) continue;
            		count++;
            		bfs(i, j);
            	}
            }
            sb.append(count + "\n");
        }
        
        System.out.print(sb);
    }
    
	static void bfs(int a, int b) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(a,b));
		
		while(!queue.isEmpty()) {
			Point point = queue.poll();
			for (int k = 0; k < 8; k++) {
				if (!isValid(point.x+dx[k], point.y + dy[k]) || arr[point.x+dx[k]][point.y + dy[k]] == 0 || visited[point.x+dx[k]][point.y + dy[k]]) continue;
				visited[point.x+dx[k]][point.y + dy[k]] = true;
                queue.add(new Point(point.x+dx[k], point.y + dy[k]));
            }
		}
	}
	
	static boolean isValid(int a, int b) {
		if (a < 0 || b < 0 || a >= X || b >= Y) return false;
		return true;
	}
}