import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] replace = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < replace.length; i++) {
            str = str.replace(replace[i], " ");
        }
        System.out.println(str.length());
    }
}