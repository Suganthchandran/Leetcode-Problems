class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int res1 = getXOR(arr1);
        int res2 = getXOR(arr2);
        return res1&res2;
    }

    public int getXOR(int[] nums) {
        int res=0;
        for(int n:nums) {
            res^=n;
        }
        return res;
    }
}