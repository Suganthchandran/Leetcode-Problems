class Solution {
    public boolean isNumber(String s) {
        boolean digitSeen=false,dotSeen=false,eSeen=false;
        int countMinusPlus = 0;

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                digitSeen = true;
            }
            else if(ch == '+' || ch == '-') {
                if(countMinusPlus == 2) {
                    return false;
                }

                if(i == s.length()-1) {
                    return false;
                }

                if(i>0 && !(s.charAt(i-1) == 'e' || s.charAt(i-1) == 'E')) {
                    return false;
                }

                countMinusPlus++;
            }
            else if(ch == '.') {
                if(eSeen || dotSeen) {
                    return false;
                }
                if(i == s.length()-1 && !digitSeen) {
                    return false;
                }
                dotSeen = true;
            }
            else if(ch == 'e' || ch == 'E') {
                if(eSeen || !digitSeen || (i==s.length()-1)) {
                    return false;
                }
                eSeen = true;
            }
            else {
                return false;
            }
        }
        return true;
    }
}