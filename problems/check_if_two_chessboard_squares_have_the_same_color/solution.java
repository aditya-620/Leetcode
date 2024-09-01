class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int column1 = coordinate1.charAt(0) - 'a'; 
        int row1 = coordinate1.charAt(1) - '1'; 
        

        int column2 = coordinate2.charAt(0) - 'a'; 
        int row2 = coordinate2.charAt(1) - '1';

        return (column1 + row1) % 2 == (column2 + row2) % 2;
    }
}