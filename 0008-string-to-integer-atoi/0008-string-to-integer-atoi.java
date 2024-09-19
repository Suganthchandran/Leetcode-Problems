class Solution {
    public int myAtoi(String s) {
        int i=0,flag = 1,countSign=0;
        long res=0;

        while(i<s.length() && s.charAt(i)==' ') {
            i++;
        }

        while(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')) {
            flag = s.charAt(i)=='-'?-1:1;
            i++;
            countSign++;
        }

        if(countSign>1) {
            return 0;
        }

        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9') {
            res = res*10 + (s.charAt(i)-'0');
            i++;

            if(res*flag > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if(res*flag < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int)res*flag;
    }
}