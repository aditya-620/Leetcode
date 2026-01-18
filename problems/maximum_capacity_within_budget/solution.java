class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;

        int[][] store = new int[n][2];
        for (int i = 0; i < n; i++) {
            store[i][0] = costs[i];
            store[i][1] = capacity[i];
        }

        Arrays.sort(store, (a, b) -> a[0] - b[0]);

        int[] maxCapPrefix = new int[n];
        maxCapPrefix[0] = store[0][1];
        for (int i = 1; i < n; i++) {
            maxCapPrefix[i] = Math.max(maxCapPrefix[i - 1], store[i][1]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int cost = store[i][0];
            int cap = store[i][1];

            if (cost < budget) {
                ans = Math.max(ans, cap);
            }

            int remaining = budget - cost - 1;
            if (remaining < 0) continue;

            int j = binarySearch(store, i - 1, remaining);
            if (j >= 0) {
                ans = Math.max(ans, cap + maxCapPrefix[j]);
            }
        }

        return ans;
    }
    private int binarySearch(int[][] store, int hi, int remaining) {
        int lo = 0, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (store[mid][0] <= remaining) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}