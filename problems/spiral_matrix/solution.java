class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        ArrayList<Integer> list = new ArrayList<>();

        //here && is taken so that m*n type matrix should also be countered
        while(sr<=er && sc <= ec){
            //top boundary
            for(int i=sc; i<=ec; i++){
                list.add(matrix[sr][i]);
            }

            //right boundary
            for(int i=sr+1; i<=er; i++){
                list.add(matrix[i][ec]);
            }

            //bottom boundary
            for(int i=ec-1; i>=sc; i--){
                //this cond occur when we have odd no. of spirals or odd n*n matrix
                //we can't print the same value again, as it is already printed in top boundary
                if(sr == er){  
                    break;
                }
                list.add(matrix[er][i]);
            }

            //left boundary
            for(int i=er-1; i>=sr+1; i--){
                //already printed in right boundary
                if(sc == ec){
                    break;
                }
                list.add(matrix[i][sc]);
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
        return list;
    }
}