class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start=1;
        int end=n-2;
        if(n==0) return -1;
        if(n==1) return 0;
        if(arr[0] > arr[1]) return start-1;
        if(arr[n-1] > arr[n-2]) return n-1;


        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]> arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] < arr[mid-1]) end = mid-1;
            else start = mid + 1;
        }
        return -1;
    }
}