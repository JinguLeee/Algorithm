import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A, B, C));
    }
    private static long pow(long a, long y, long p) {
        if(y == 0) return 1;
        if(y == 1) return a % p;

        long temp = pow(a, y/2, p);
        if((y & 1) == 1) {
            return a % p * temp % p * temp % p % p;
        }else {
            return temp % p * temp % p % p;
        }
    }
}
