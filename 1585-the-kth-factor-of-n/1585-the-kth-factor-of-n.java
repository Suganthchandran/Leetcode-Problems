class Solution {
    public int kthFactor(int n, int k) {
        int j = 0;
        int res[] = new int[100];
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                k--;
                if(k==0)
                    return i;
            }
        }
        return -1;
    }
}