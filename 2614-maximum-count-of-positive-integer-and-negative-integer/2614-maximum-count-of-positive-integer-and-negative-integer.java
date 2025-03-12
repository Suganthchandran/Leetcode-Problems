class Solution {
    public int maximumCount(int[] nums) {
        int PosCount=0,NegCount=0;
        for(int num : nums) {
            if(num>0) {
                PosCount++;
            }
            else if(num<0) {
                NegCount++;
            }
        }
        return Math.max(PosCount,NegCount);
    }
}