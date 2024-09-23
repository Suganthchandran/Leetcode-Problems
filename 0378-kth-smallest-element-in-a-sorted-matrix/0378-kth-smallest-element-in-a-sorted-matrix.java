class Solution {
    public int kthSmallest(int[][] nums, int k) {
        int n = nums.length;
        int s = nums[0][0];
        int e = nums[n-1][n-1];

        while(s<e) {
            int mid = s+(e-s)/2;
            int count = FindCount(nums,mid);

            if(count < k) {
                s = mid+1;
            }
            else {
                e = mid;
            }
        }
        return s;
    }

    public int FindCount(int[][] nums,int target) {
        int n = nums.length;
        int row = n-1;
        int col = 0;
        int count = 0;
        while(row >= 0 && col < n) {
            if(nums[row][col] <= target) {
                count += row+1;
                col++;
            }
            else {
                row--;
            }
        }
        return count;
    }
}