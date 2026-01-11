class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            set.add(s.charAt(i));

            int distinct = set.size();
            int lenMod = (i+1) % 3;

            if (distinct == lenMod) {
                count++;
            }
        }

        return count;
    }
}
