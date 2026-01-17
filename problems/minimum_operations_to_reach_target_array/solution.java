class Solution {
    public int minOperations(int[] nums, int[] target) {
        int[] clone = nums.clone();

        Set<Integer> needOp = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(clone[i] != target[i]){
                needOp.add(clone[i]);
            }
        }
        return needOp.size();
    }
}