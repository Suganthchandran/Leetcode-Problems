class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int num : nums) {
            if(!res.contains(num))
                res.add(num);
            else
                res.remove(num);
        }

        int[] ans = new int[2];
        int i = 0;
        for(int num : res) {
            ans[i++] = num;
        }
        return ans;
    }
}