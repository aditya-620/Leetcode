class Solution {
    public void setZeroes(int[][] matrix) {
        
        int n = matrix.length;      // rows
        int m = matrix[0].length;   // columns
        //optimal approach
        int col0 = 1;

        // Step 1: Mark first row and first column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark zeroes based on first row and column
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first column
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
        

        //better approach - O(2*(N*M))
        // int row[] = new int[n];
        // int col[] = new int[m];

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == 0){
        //             row[i] = 1;
        //             col[j] = 1;
        //         }
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(row[i] == 1 || col[j] == 1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }



        //brute force - O((N*M)*(N + M)) + O(N*M)      
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (matrix[i][j] == 0) {
        //             markrow(matrix, m, i);  
        //             markcol(matrix, n, j);  
        //         }
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (matrix[i][j] == -1) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
    }

    // public static void markrow(int[][] matrix, int m, int row) {
    //     for (int j = 0; j < m; j++) {
    //         if (matrix[row][j] != 0) {
    //             matrix[row][j] = -1;
    //         }
    //     }
    // }

    // public static void markcol(int[][] matrix, int n, int col) {
    //     for (int i = 0; i < n; i++) {
    //         if (matrix[i][col] != 0) {
    //             matrix[i][col] = -1;
    //         }
    //     }
    // }
}