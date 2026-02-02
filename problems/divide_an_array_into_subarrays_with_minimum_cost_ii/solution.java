class Solution {
    TreeMap<Integer, Integer> small = new TreeMap<>();
    TreeMap<Integer, Integer> large = new TreeMap<>();
    long sumSmall = 0;
    int smallSize = 0;

    private void add(TreeMap<Integer, Integer> map, int x) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }

    private void remove(TreeMap<Integer, Integer> map, int x) {
        if (map.get(x) == 1) map.remove(x);
        else map.put(x, map.get(x) - 1);
    }

    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        long ans = Long.MAX_VALUE;

        int left = 1;

        for (int right = 1; right < n; right++) {
            // Add nums[right]
            add(small, nums[right]);
            sumSmall += nums[right];
            smallSize++;

            // Balance if small too big
            if (smallSize > k - 1) {
                int maxSmall = small.lastKey();
                remove(small, maxSmall);
                sumSmall -= maxSmall;
                smallSize--;
                add(large, maxSmall);
            }

            // Shrink window
            while (right - left > dist) {
                int x = nums[left];
                if (small.containsKey(x)) {
                    remove(small, x);
                    sumSmall -= x;
                    smallSize--;
                    if (!large.isEmpty()) {
                        int minLarge = large.firstKey();
                        remove(large, minLarge);
                        add(small, minLarge);
                        sumSmall += minLarge;
                        smallSize++;
                    }
                } else {
                    remove(large, x);
                }
                left++;
            }

            // Valid window
            if (smallSize == k - 1) {
                ans = Math.min(ans, sumSmall);
            }
        }

        return nums[0] + ans;
    }
}
