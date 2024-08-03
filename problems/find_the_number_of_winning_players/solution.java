class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        // Map to track the number of balls picked by each player per color
        Map<Integer, Map<Integer, Integer>> playerPicks = new HashMap<>();
        
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            
            playerPicks.putIfAbsent(player, new HashMap<>());
            Map<Integer, Integer> colorCount = playerPicks.get(player);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }
        
        int winningPlayers = 0;
        
        // Check for each player if they win
        for (int player = 0; player < n; player++) {
            Map<Integer, Integer> colorCount = playerPicks.get(player);
            if (colorCount != null) {
                for (int count : colorCount.values()) {
                    if (count > player) {
                        winningPlayers++;
                        break;
                    }
                }
            }
        }
        
        return winningPlayers;
    }
}