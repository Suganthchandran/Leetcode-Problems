class Solution {
    public int findNthDigit(int n) {
        int digit = 1;
        int digit_interval = 9;

        while(n-digit_interval > 0)  {
            n = n-digit_interval;
            digit += 1;
            digit_interval = 9*((int)Math.pow(10,digit-1))*digit;

            if(digit_interval < 0) 
                break;
        }

        int base = (int)Math.pow(10,digit-1);

        int ans = base+(n-1)/digit;
        
        char str = String.valueOf(ans).charAt((n-1)%digit);

        return str-'0';
    }
}