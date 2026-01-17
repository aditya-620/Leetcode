class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int cx = center[0], cy = center[1];

        int bestQuality = -1;
        int bestX = -1, bestY = -1;

        for (int[] tower : towers) {
            int x = tower[0];
            int y = tower[1];
            int quality = tower[2];

            int distance = Math.abs(x - cx) + Math.abs(y - cy);

            if (distance <= radius) {
                if (quality > bestQuality ||
                   (quality == bestQuality && 
                   (x < bestX || (x == bestX && y < bestY)))) {

                    bestQuality = quality;
                    bestX = x;
                    bestY = y;
                }
            }
        }

        if (bestQuality == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{bestX, bestY};
    }
}
