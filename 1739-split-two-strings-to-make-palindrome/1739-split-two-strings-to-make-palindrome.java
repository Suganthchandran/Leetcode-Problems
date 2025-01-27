// class Solution {
//     public boolean checkPalindromeFormation(String a, String b) {
//         int len = a.length();
//         for(int i=0;i<len;i++) {
//             if(Palindrome(a.substring(0,i)+b.substring(i)) || Palindrome(b.substring(0,i)+a.substring(i))) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public boolean Palindrome(String str) {
//         int s = 0;
//         int e = str.length()-1;
//         while(s<=e) {
//             if(str.charAt(s) != str.charAt(e)) {
//                 return false;
//             }
//             s++;
//             e--;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }

    public boolean check(String a, String b) {
        int s = 0;
        int e = b.length()-1;
        while(s<e && a.charAt(s) == b.charAt(e)) {
            s++;
            e--;
        }
        if(s>=e) return true;
        return isPalindrome(a.substring(s,e+1)) || isPalindrome(b.substring(s,e+1));
    }

    public boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length()-1;
        while(s<=e) {
            if(str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}