class Solution {
    public int findKthPositive(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;



        while(start<=end) {
            int mid = start+(end-start)/2;
            int miss = nums[mid]-(mid+1);
            if(miss < k) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return start+k;
    }
}