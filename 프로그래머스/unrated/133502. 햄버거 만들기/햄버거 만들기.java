class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int index = 0;
        int[] hamburger = new int[ingredient.length];
        for (int i = 0; i < ingredient.length; i++) {
            hamburger[index] = ingredient[i];
            index++;
            if (index < 4) continue;
            if (hamburger[index-4] == 1 && hamburger[index-3] == 2
                    && hamburger[index-2] == 3 && hamburger[index-1] == 1) {
                answer++;
                index -= 4;
            }
        }
        return answer;
    }
}