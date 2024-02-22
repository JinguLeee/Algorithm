import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long num = 0;
        long sum = 0;

        while (N > sum + num)
            sum += ++num;
        
        System.out.println(num);
    }
}