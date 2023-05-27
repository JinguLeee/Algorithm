import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int rank = rankMap.get(callings[i]);
            String player = players[rank-1];
            String player2 = players[rank];
            rankMap.put(player2, rank-1);
            rankMap.put(player, rank);
            players[rank-1] = player2;
            players[rank] = player;
        }
        
        for (String player : rankMap.keySet()) {
            players[rankMap.get(player)] = player;
        }
        return players;
    }
}