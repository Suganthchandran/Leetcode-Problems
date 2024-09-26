class Solution {
    public int xorOperation(int n, int start) {
        int i = start,res=0;
        int count = 0;
        while(count<n) {
            res ^= i; 
            i += 2;
            count++;
        }
        return res;
    }
}