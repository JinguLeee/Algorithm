import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        int count = 0;
        
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < N-1; i++) 
        	maxPq.offer(Integer.parseInt(br.readLine()));
        
        while(true) {
        	if (maxPq.isEmpty()) break;
        	int maxCnt = maxPq.poll();
        	if (cnt > maxCnt) break;
        	
        	maxPq.offer(maxCnt-1);
        	cnt++;
        	count++;
        }
        
        System.out.println(count);
    }
}