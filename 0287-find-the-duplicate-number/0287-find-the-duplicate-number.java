class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        int i=0;
        while(i<n) {

            if(i!=nums[i]-1) {
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]) {
                    swap(nums,i,correct);
                }
                else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }

        return -1;
    }

    public void swap(int[] nums,int a,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}