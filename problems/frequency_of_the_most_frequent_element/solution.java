class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); 
        long windowSum = 0; 
        int left = 0;
        int maxFreq = 1;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            // Check if current window is valid
            // totalNeeded = nums[right] * windowSize - windowSum
            while ((long) nums[right] * (right - left + 1) - windowSum > k) {
                windowSum -= nums[left];
                left++; // shrink window
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}