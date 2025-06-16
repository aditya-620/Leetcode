class Solution {
    public int longestConsecutive(int[] nums) {
        //optimal approach
        int n = nums.length;
        int longest = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }  

        for(int it : set){
            if(!set.contains(it-1)){
                int count = 1;
                int x = it;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;

        //better approach
    //    int lastsmaller = Integer.MIN_VALUE;
    //    int count = 0;
    //    int longest = 0;
        
    //    Arrays.sort(nums);
    //    for(int i=0; i<nums.length; i++){
    //        if(nums[i]-1 == lastsmaller){
    //            count++;
    //            lastsmaller = nums[i];
    //        } else if (nums[i] != lastsmaller){
    //            count = 1;
    //            lastsmaller = nums[i];
    //        }
    //        longest = Math.max(longest,count);
    //    }
    //    return longest;




        //brute force
    //     int n = nums.length;
    //     int count = 1;
    //     int maxcount = 0;
    //     if(n==0) return maxcount;

    //     for(int i=0; i<n; i++){
    //         int x = nums[i];
    //         while(linearSearch(nums, x+1)){
    //             x = x+1;
    //             count++;
    //         }
    //         maxcount = Math.max(maxcount, count);
    //         count = 1;
    //     }
    //     return maxcount;
    }
    // public static boolean linearSearch(int arr[], int x){
    //     int n = arr.length;
    //     for(int i=0; i<n; i++){
    //         if(x == arr[i]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}