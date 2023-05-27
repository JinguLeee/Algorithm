class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int l = park[0].length();
        int sh = 0;
        int sl = 0;
        String[][] parkMap = new String[h][l];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                parkMap[i][j] = park[i].substring(j,j+1);
                if (parkMap[i][j].equals("S")) {
                    sh = i;
                    sl = j;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] moveRoute = routes[i].split(" ");
            boolean isMove = true;
            int mh = sh;
            int ml = sl;
            for (int j = 0; j < Integer.parseInt(moveRoute[1]); j++) {
                 switch (moveRoute[0]) {
                     case "N":
                         if (mh-1 < 0 || parkMap[mh-1][ml].equals("X")) {
                             isMove = false;
                             break;
                         }
                         mh--;
                         break;
                     case "E":
                         if (ml+1 > l-1 || parkMap[mh][ml+1].equals("X")) {
                             isMove = false;
                             break;
                         }
                         ml++;
                         break;
                     case "W":
                         if (ml-1 < 0 || parkMap[mh][ml-1].equals("X")) {
                             isMove = false;
                             break;
                         }
                         ml--;
                         break;
                     case "S":
                         if (mh+1 > h-1 || parkMap[mh+1][ml].equals("X")) {
                             isMove = false;
                             break;
                         }
                         mh++;
                         break;
                 }
            }
            if (isMove == false) continue;
            sh = mh;
            sl = ml;
        }

        int[] answer = {sh, sl};
        return answer;
    }
}