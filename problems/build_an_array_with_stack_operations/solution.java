class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        
        int t = 0; 
        
        for (int i = 1; i <= n; i++) {
            if (t == target.length) break; 
            
            if (i == target[t]) {
                ops.add("Push");
                t++;      
            } else {
                ops.add("Push");
                ops.add("Pop");
            }
        }
        
        return ops;
    }
}