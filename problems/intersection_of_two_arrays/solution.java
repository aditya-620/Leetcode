class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Both the array should be sorted and repition is allowed in result
        // int n = nums1.length;
        // int m = nums2.length;

        // int i=0, j=0, k=0;
        // int arr[] = new int[n];
        // while(i<n && j<m){
        //     if(nums1[i] < nums2[j]){
        //         i++;
        //     } else if(nums1[i] > nums2[j]){
        //         j++;
        //     } else {
        //         arr[k++] = nums1[i];
        //         i++;
        //         j++;
        //     }
        // }
        // return arr;


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add all elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check nums2 elements in set1 for intersection
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); // set ensures uniqueness
            }
        }

        // Convert resultSet to int[]
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}