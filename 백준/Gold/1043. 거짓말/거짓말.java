import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 사람 수
        int N = Integer.parseInt(st.nextToken());
        // 파티 수
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int count = Integer.parseInt(st.nextToken());

        // 진실을 알고 있는 사람 없으면 바로 파티수 출력
        if (count == 0) {
            System.out.println(M);
            return;
        }

        // 진실을 처음 부터 알고 있는 List
        List<Integer> knowList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            knowList.add(Integer.parseInt(st.nextToken()));
        }

        // 집합 관계를 위한 배열
        parent = new int[N+1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        // 파티 리스트
        List<Integer>[] partyList = new List[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            // 파티 참석한 인원
            count = Integer.parseInt(st.nextToken());

            // 파티 참석한 리스트
            List<Integer> party = new ArrayList<>();
            party.add(Integer.parseInt(st.nextToken()));
            
            // 참석 인원이 2명 이상이면 관계를 확인하여 집합 관계를 설정
            for (int j = 1; j < count; j++) {
                party.add(Integer.parseInt(st.nextToken()));
                int a = party.get(j-1);
                int b = party.get(j);
                if (find(a) != find(b)) union(a, b);
            }
            partyList[i] = party;
        }

        // 최종으로 아는 사람 리스트
        boolean[] knowPerson = new boolean[N+1];
        for (int i = 0; i < knowList.size(); i++) {
            int person = knowList.get(i);
            knowPerson[person] = true;
            
            for (int j = 1; j <= N; j++) {
                if (knowPerson[j]) continue;
                if (find(person) == find(j)) knowPerson[j] = true;
            }
        }

        int sum = 0;
        for (int i = 0; i < partyList.length; i++) {
            List<Integer> party = partyList[i];
            boolean talk = true;
            for (int j = 0; j < party.size(); j++) {
                if (knowPerson[party.get(j)]) {
                    talk = false;
                    break;
                }
            }
            if (talk) sum++;
        }
        System.out.println(sum);
    }
    static int find(int x){
        if(parent[x] == x) return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }

    static void union(int a, int b){
        int parentB = find(b);
        parent[parentB] = a;
    }
}