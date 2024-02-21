import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	for (int j = 0; j < N; j++) 
        		maxPq.offer(Integer.parseInt(st.nextToken()));
        }
        
        for (int i = 0; i < N-1; i++) maxPq.poll();
        
        System.out.println(maxPq.poll());
    }
}