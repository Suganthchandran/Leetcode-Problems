class Solution {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;

        while(start<=end) {
            long mid = start+(end-start)/2;
            long k = mid*(mid+1)/2;

            if(k>n) {
                end = mid-1;
            }
            else if(k<n) {
                start = mid+1;
            }
            else {
                return (int)mid;
            }
        }
        return (int)end;
    }
}