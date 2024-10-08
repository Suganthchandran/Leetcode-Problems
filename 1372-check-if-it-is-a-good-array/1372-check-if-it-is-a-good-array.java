class Solution {
    public boolean isGoodArray(int[] nums) {
        int temp = nums[0];
        int i=0;
        while(i<nums.length) {
            temp = gcd(temp,nums[i]);
            i++;
            if(temp==1) return true;
        }
        return false;
    }

    public int gcd(int a,int b) {
        if(a==0) {
            return b;
        }
        return gcd(b%a,a);
    }
}