class Solution {
    public int generateKey(int num1, int num2, int num3) {

        String strNum1 = String.format("%04d", num1);
        String strNum2 = String.format("%04d", num2);
        String strNum3 = String.format("%04d", num3);
        
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char minDigit = minChar(strNum1.charAt(i), strNum2.charAt(i), strNum3.charAt(i));
            key.append(minDigit);
        }
        return Integer.parseInt(key.toString());
    }

    private static char minChar(char a, char b, char c) {
        return (char) Math.min(Math.min(a, b), c);
    }
}