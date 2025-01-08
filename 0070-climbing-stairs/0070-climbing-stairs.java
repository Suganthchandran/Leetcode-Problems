class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(dp,n);
    }

    public int solve(int[] dp,int n) {
        if(n==1 || n==2) {
            return n;
        }
        else if(dp[n]!=-1) {
            return dp[n];
        }
        else {
            return dp[n] = solve(dp,n-1)+solve(dp,n-2);
        }
    }
}