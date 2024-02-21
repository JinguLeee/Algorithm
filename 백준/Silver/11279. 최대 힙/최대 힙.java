import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
        	num = Integer.parseInt(br.readLine());
        	if (num == 0) {
        		num = (maxPq.isEmpty()? 0 : maxPq.poll());
        		sb.append(num + "\n");
        	} else maxPq.offer(num);
        	
        }
        System.out.println(sb);
    }
}