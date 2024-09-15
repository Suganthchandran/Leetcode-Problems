class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        bubble(nums,n);
    }

    public void bubble(int[] nums,int n) {
        boolean swapped;
        for(int i=0;i<n-1;i++) {
            swapped = false;
            for(int j=1;j<n-i;j++) {
                if(nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}