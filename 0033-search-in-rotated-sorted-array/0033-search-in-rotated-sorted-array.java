class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        // If no pivot is found, do a normal binary search
        if(pivot == -1) {
            return Binary(nums, target, 0, nums.length - 1);
        }

        // If the target is the pivot element
        if(nums[pivot] == target) {
            return pivot;
        }

        // If target is in the left part
        if(nums[0] <= target) {
            return Binary(nums, target, 0, pivot - 1);
        }

        // If target is in the right part
        return Binary(nums, target, pivot + 1, nums.length - 1);
    }

    public int Binary(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] > target) {
                end = mid - 1;
            } 
            else if(nums[mid] < target) {
                start = mid + 1;
            } 
            else {
                return mid;
            }
        }
        return -1;
    }

    public int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Pivot found, larger than the next element
            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: Pivot found, smaller than the previous element
            if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 3: Left half is sorted
            if(nums[start] <= nums[mid]) {
                start = mid + 1;
            } 
            // Case 4: Right half is sorted
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
