class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int len = s.length();
        int i=0,j=0,count=0,max=0;

        while(i < len) {
            if(map.get(s.charAt(i)) != null) {
                j = Math.max(j,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            count = i-j+1;
            max = Math.max(count,max);
            i++;
        }
        return max;
    }
}