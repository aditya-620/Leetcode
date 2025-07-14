class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: all pairs are used
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add '(' if we have not used all opening brackets
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Add ')' if we have more opening brackets to match
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}