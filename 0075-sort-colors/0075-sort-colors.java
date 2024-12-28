class Solution {
    public void sortColors(int[] nums) {
        int low = 0,high = nums.length-1,mid = 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[mid]==0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}