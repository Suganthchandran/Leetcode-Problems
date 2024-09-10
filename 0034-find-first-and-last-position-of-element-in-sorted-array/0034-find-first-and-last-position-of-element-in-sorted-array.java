class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};

        res[0] = binary(nums,target,true);
        res[1] = binary(nums,target,false);

        return res;
    }

    public int binary(int[] nums,int target,boolean firstOccurence ) {
        int s = 0;
        int e = nums.length-1;
        int res = -1;

        while(s<=e) {
            int mid = s+(e-s)/2;

            if(nums[mid] < target) {
                s = mid+1;
            }
            else if(nums[mid] > target) {
                e = mid-1;
            }
            else {
                res = mid;
                if(firstOccurence)
                    e = mid-1;
                else
                    s = mid+1;
            }
        }
        return res;
    }
}