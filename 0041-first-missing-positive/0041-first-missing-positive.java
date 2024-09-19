class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        int i=0;
        while(i<n) {
            int correct = nums[i]-1;
            if(nums[i] > 0 && nums[i]<n && nums[i]!=nums[correct]) {
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }

        // System.out.println(Arrays.toString(nums));

        for(int j=0;j<n;j++) {
            if(j!=nums[j]-1) {
                return j+1;
            }
        }
        return n+1;
    }
    
    public void swap(int[] nums,int a,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}