class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int n = nums.length;
        // int s = n,j=0;;
        // int[] res = new int[n];
        // for(int i=0;i<n;i++) {
        //     if(nums[i]%2==0) {
        //         res[j++] = nums[i];
        //     }
        //     else {
        //         res[--s] = nums[i];
        //     }
        // }
        // return res;

        int l = 0;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i]%2==0) {
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
        return nums;
    }
}