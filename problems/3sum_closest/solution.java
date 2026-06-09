class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n = arr.length;
        int maxdiff = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(sum - target);

                if(diff < maxdiff) {
                    maxdiff = diff;
                    result = sum;
                }

                if(sum == target) {
                    return target;
                } else if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}