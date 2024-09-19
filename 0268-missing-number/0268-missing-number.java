class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        return Answer(nums,n);
    }

    public int Answer(int[] nums,int n) {
        int i=0;
        while(i<n) {
            if(i!=nums[i] && nums[i]!=n) {
                swap(nums,i,nums[i]);
            }
            else {
                i++;
            }
        }

        for(int j=0;j<n;j++) {
            if(j!=nums[j]) {
                return j;
            }
        }
        return n;
    }

    public void swap(int[] nums,int a,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}