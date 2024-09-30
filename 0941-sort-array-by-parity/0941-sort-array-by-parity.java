class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int s = n,j=0;;
        int[] res = new int[n];
        for(int i=0;i<n;i++) {
            if(nums[i]%2==0) {
                res[j++] = nums[i];
            }
            else {
                res[--s] = nums[i];
            }
        }
        return res;
    }
}