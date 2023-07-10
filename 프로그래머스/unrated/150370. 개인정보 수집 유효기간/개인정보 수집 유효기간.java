import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> dayMap = new HashMap<>();
        int[] daysint = Arrays.stream(today.split("\\."))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (String term : terms) {
            String[] termSplit = term.split(" ");
            int[] daysCopy = daysint.clone();
            daysCopy[1] = daysint[1] - Integer.parseInt(termSplit[1]);
            if (daysCopy[1] < 1) {
                daysCopy[0] += (daysCopy[1] / 12 - 1);
                daysCopy[1] = 12 + daysCopy[1] % 12;
            }
            dayMap.put(termSplit[0], Integer.parseInt(Arrays.stream(daysCopy)
                    .mapToObj(num -> String.format("%02d", num))
                    .reduce("", (a, b) -> a + b)));
        }

        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] num = privacies[i].split(" ");
            if (Integer.parseInt(num[0].replace(".", "")) <= dayMap.get(num[1])) count.add(i+1);
        }


        int[] answer = new int[count.size()];
        for (int i = 0; i < count.size(); i++) {
            answer[i] = count.get(i);
        }

        return answer;
    }
}