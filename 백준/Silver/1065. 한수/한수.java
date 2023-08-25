import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (N < 100) {
        	System.out.println(N);
        	return;
        }
        
        int count = 99;
        for (int i = 100; i <= N; i++) {
        	int num1 = i/100;
        	int num2 = i/10 % 10;
        	int num3 = i % 10;
        	
        	if (num1-num2 == num2-num3) count++;
        }
        
        System.out.println(count);
    }
}