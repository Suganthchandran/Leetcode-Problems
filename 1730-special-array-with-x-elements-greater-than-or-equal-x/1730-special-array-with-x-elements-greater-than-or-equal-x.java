class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length;

        for(int i=start;i<=end;i++) {
            int ans=0;

            for(int num : nums) {
                if(num >= i) {
                    ans++;
                }
            }

            if(ans==i) {
                return i;
            }
        }
        return -1;

    }
}