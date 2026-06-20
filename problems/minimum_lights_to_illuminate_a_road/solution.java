class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;

        int[] ravelunico = lights;

        int[] diff = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (lights[i] > 0) {
                int l = Math.max(0, i - lights[i]);
                int r = Math.min(n - 1, i + lights[i]);

                diff[l]++;
                diff[r + 1]--;
            }
        }

        boolean[] visible = new boolean[n];
        int cur = 0;

        for (int i = 0; i < n; i++) {
            cur += diff[i];
            visible[i] = cur > 0;
        }

        int ans = 0;
        int i = 0;

        while (i < n) {
            if (visible[i]) {
                i++;
                continue;
            }

            
            ans++;

            int coverUntil = i + 2;
            i++;
            while (i < n) {
                if (!visible[i] && i > coverUntil) {
                    break;
                }
                i++;
            }
        }

        return ans;
    }
}