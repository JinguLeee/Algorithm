class Solution {
    public int[] solution(String[] wallpaper) {
        int sX = 0;
        int sY = 0;
        int eX = 0;
        int eY = 0;
        boolean start = false;
        for (int i = 0; i < wallpaper.length; i++) {
            char[] charArray = wallpaper[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == '#') {
                    if (start == false) {
                        sX = i;
                        sY = j;
                        eX = i;
                        eY = j;
                        start = true;
                    }
                    else {
                        if (sY > j) sY = j;
                        if (eX < i) eX = i;
                        if (eY < j) eY = j;
                    }
                }
            }
        }
        int[] answer = {sX, sY, eX + 1, eY + 1};
        return answer;
    }
}