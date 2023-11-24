import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cnt = Integer.parseInt(br.readLine());
        
        int note1Cnt;
        StringTokenizer st;
        HashSet<Integer> noteSet;
        
        for (int i = 0; i < cnt; i++) {
        	noteSet = new HashSet<>();
        	note1Cnt = Integer.parseInt(br.readLine());
        	st = new StringTokenizer(br.readLine()," ");
        	for (int j = 0; j < note1Cnt; j++) {
        		noteSet.add(Integer.parseInt(st.nextToken()));
        	}
        	
        	note1Cnt = Integer.parseInt(br.readLine());
        	st = new StringTokenizer(br.readLine()," ");
        	for (int j = 0; j < note1Cnt; j++) {
        		if (noteSet.contains(Integer.parseInt(st.nextToken()))) sb.append(1 + "\n");
        		else sb.append(0 + "\n");
        	}
        }
        System.out.println(sb);
    }
}