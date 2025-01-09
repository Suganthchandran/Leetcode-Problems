class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int ans=0;
        for(String s : words) {
            int count = 0;
            if(s.length() >= pref.length()) {
                for(int i=0;i<n;i++) {
                if(s.charAt(i) == pref.charAt(i)) {
                    count+=1;
                }
                }
                if(count == n) {
                    ans+=1;
                }
            }
        }
        return ans;
    }
}