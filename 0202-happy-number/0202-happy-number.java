class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = FindSquare(slow);
            fast = FindSquare(FindSquare(fast));
        } while(fast!=slow);

        if(slow==1)
            return true;
        else
            return false;
    }

    public int FindSquare(int n) {
        int rem,res=0;
        while(n>0) {
            rem = n%10;
            res += rem*rem;
            n = n/10;
        }
        return res;
    }
}