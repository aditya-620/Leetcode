class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            int value = mpp.getOrDefault(s.charAt(i), 0);
            mpp.put(s.charAt(i), value + 1);
        }

        for (Map.Entry<Character, Integer> it : mpp.entrySet()) {
            if(it.getValue()%2 == 0){
                mpp.put(it.getKey(), 2);
            } else {
                mpp.put(it.getKey(), 1);
            }
        }
        int sum = 0;
        for (int value : mpp.values()) {
            sum += value;
        }
        return sum;
    }
}