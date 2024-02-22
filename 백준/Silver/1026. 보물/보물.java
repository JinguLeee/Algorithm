import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1, st2;

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        
        st1 = new StringTokenizer(br.readLine()," ");
        st2 = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
        	minPq.offer(Integer.parseInt(st1.nextToken()));
        	maxPq.offer(Integer.parseInt(st2.nextToken()));
        }
        	
        
        for (int i = 0; i < N; i++) {
        	answer += (minPq.poll() * maxPq.poll());
        }
        
        System.out.println(answer);
    }
}