class Solution {
    public int findPeakElement(int[] nums) {
        return findPeak(nums);
    }

    public int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid element is greater than its next element, peak is in the left half
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } 
            // Otherwise, peak is in the right half
            else {
                start = mid + 1;
            }
        }
        // At the end of the loop, start == end and it points to the peak element
        return start;
    }
}
