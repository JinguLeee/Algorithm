import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        for (int i = 0; i < report.length; i++) {
            String[] reportArr = report[i].split(" ");
            HashSet reportId = reportMap.getOrDefault(reportArr[1], new HashSet<>());
            reportId.add(reportArr[0]);
            reportMap.put(reportArr[1], reportId);
        }

        HashMap<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            HashSet reportId = reportMap.getOrDefault(id_list[i], new HashSet<>());
            if (reportId.size() < k) continue;
            for (Object o : reportId) {
                countMap.put((String) o, countMap.getOrDefault(o, 0) + 1);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = countMap.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}