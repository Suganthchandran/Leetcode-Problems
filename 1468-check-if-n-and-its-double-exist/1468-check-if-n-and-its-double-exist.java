class Solution {
    public boolean checkIfExist(int[] nums) {
        Set<Integer> a = new HashSet<>();

        for(int num : nums) {
            if(a.contains(num*2) || (num%2==0 && a.contains(num/2)) ) {
                return true;
            }
            a.add(num);
        }
        return false;
    }
}