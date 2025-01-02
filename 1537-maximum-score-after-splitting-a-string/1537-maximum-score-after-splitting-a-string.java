class Solution {
    public int maxScore(String s) {
        int totZeros = 0;
        int ans = 0;
        int zeros = 0;
        int n = s.length();
        for(char c : s.toCharArray()) {
            if(c == '0') {
                totZeros++;
            }
        }

        for(int i=1;i<n;i++) {
            if(s.charAt(i-1) == '0') {
                zeros++;
                totZeros--;
            }
            ans = Math.max(ans, zeros + (n-totZeros-i));
        }

        return ans;
    }
}