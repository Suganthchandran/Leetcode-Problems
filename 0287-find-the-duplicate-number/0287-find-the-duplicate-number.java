class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        int i=0;
        while(i<n) {
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]) {
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }

        return nums[n-1];
    }

    public void swap(int[] nums,int a,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}