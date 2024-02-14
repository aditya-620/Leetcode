class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        int p1 = 0, p2 = 0;
        while(p2 < nums.length/2){
            ans.add(pos.get(p1));
            p1++;
            ans.add(neg.get(p2));
            p2++;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}

// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int[] ans = new int[nums.length];
//         int pos = 0, neg = 1;
        
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 ans[pos] = nums[i];
//                 pos += 2;
//             } else {
//                 ans[neg] = nums[i];
//                 neg += 2;
//             }
//         }
        
//         return ans;
//     }
// }
