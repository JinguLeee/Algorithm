import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 2; i <= N; i++) {
        	if (i % 5 != 0) continue;
        	int num = i;
        	while (num % 5 == 0) {
        		num /= 5;
        		cnt++;	
        	}
        }
        
        System.out.println(cnt);
    }
}