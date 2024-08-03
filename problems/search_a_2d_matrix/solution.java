class Solution {
    public boolean binarySearch(int matrix[],int target){
        int start = 0;
        int end = matrix.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(matrix[mid] == target){
                return true;
            } 
            if(matrix[mid] < target){
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return false;


    }
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;

        // apply BS on the last column, this way we can reduce the no of rows in which
        // we want to apply BS to just 1.
        int lb = 0;
        int ub = row - 1;

        while (lb < ub) {
            int mid = lb + (ub - lb) / 2;

            if (arr[mid][col - 1] < target) {
                lb = mid + 1;
            } else if (arr[mid][col - 1] > target) {
                ub = mid;
            } else {
                return true;
            }
        }

        // here lb == rb
        boolean ind = binarySearch(arr[lb], target);
        if (ind != false){
            return true;
        }
        return false;
    }
}