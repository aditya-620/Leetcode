class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(0, 0);
        count.put(1, 0);
        count.put(2, 0);

        for (int num : nums) {
            count.put(num, count.get(num) + 1);
        }

        int idx = 0;
        for (int i = 0; i < 3; i++) {
            int freq = count.get(i);
            for (int j = 0; j < freq; j++) {
                nums[idx] = i;
                idx++;
            }
        }        
    }
}