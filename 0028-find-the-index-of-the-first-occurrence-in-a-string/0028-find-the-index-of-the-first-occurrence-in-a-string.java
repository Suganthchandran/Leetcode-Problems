class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);

        int t = haystack.length();
        int p = needle.length();

        if(t<p) {
            return -1;
        }

        for(int i=0;i<=t-p;i++) {
            int j=0;
            while(j<p && haystack.charAt(j+i)==needle.charAt(j)) {
                j++;
            }
            if(j==p) {
                return i;
            }
        }
        return -1;
    }
}