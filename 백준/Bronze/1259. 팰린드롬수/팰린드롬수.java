import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        
        while (true) {
        	str = br.readLine();
        	if (str.equals("0")) break;
            
        	int length = str.length();
            int count = 0;
            boolean check = true;
            
            if (length % 2 == 0) count = length / 2 - 1;
            else count = length / 2;
            
            for (int i = 0; i <= count; i++) {
            	if (str.charAt(i) != str.charAt(length-i-1)){
            		check = false;
            		break;
            	}
            }
            sb.append(check ? "yes" : "no").append("\n");
        }
        System.out.println(sb);
    }
}