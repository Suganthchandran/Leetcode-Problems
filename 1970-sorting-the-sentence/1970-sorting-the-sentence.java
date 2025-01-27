class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        for(String ss : str) {
            res[ss.charAt(ss.length()-1)-'1'] = ss.substring(0,ss.length()-1);
        }
        return String.join(" ",res);
    }
}