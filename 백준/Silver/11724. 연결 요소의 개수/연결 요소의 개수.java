import java.io.*;
import java.util.*;

public class Main {
	static int[][] arr;
	static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        for (int i = 1; i <= M; i++) {
        	st = new StringTokenizer(br.readLine()," ");

        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	arr[a][b] = arr[b][a] = 1;
        }
        
        int count = 0;
        for (int i = 1; i <= N; i++) {
        	if (arr[0][i] == 1) continue;
        	count++;
        	bfs(i);
        }
        System.out.print(count);
    }
    
	static void bfs(int a) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(a);
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			for (int i = 1; i <= N; i++) {
				if (arr[0][i] == 1 || arr[num][i] == 0) continue;
				arr[0][i] = 1;
				queue.add(i);
			}
		}
	}
}