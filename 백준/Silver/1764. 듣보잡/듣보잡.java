import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> arrSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            arrSet.add(br.readLine());
        }

        List<String> existList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if(arrSet.contains(name))
            existList.add(name);
        }

        Collections.sort(existList);
        sb.append(existList.size() + "\n");
        for (String s : existList) {
            sb.append(s + "\n");
        }

        System.out.println(sb);
    }
}
