class Solution {
    public int mySqrt(int x) {
        int s = 1;
        int e = x;

        if(x<2) {
            return x;
        }

        while(s<=e) {
            int mid = s+(e-s)/2;
            long ans = (long)mid*mid;
            if(ans < x) {
                s = mid+1;
            }
            else if(ans > x) {
                e = mid-1;
            }
            else {
                return mid;
            }
        }
        return e;
    }
}