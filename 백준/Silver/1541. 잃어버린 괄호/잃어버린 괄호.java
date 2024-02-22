import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] splitStr = br.readLine().split("-");
        int result = 0; 
        
        for (int i = 0; i < splitStr.length; i++) {
        	String[] sum = splitStr[i].split("\\+");
        	for (String num : sum) {
        		if (i == 0) result += Integer.parseInt(num);
        		else result -= Integer.parseInt(num);
        	}
        }
        
        System.out.println(result);
    }
}