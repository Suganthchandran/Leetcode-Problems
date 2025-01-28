class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum=0,dpTemp=0,max=Integer.MIN_VALUE;
        int[] dp = new int[n+1];
        if(n==0 || n==1) {
            return 0;
        }

        for(int i=0;i<n;i++) {
            sum += nums[i];
            dpTemp += i*nums[i];
        }
        dp[0] = dpTemp;
        for(int i=1;i<=n;i++) {
            dp[i] = dp[i-1]+sum-n*nums[n-i];
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}