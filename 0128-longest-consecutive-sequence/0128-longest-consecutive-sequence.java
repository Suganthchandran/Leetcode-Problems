class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0; // Edge case

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // Add all elements to the set
        }

        int ans = 0;

        // Process each number in the set
        for (int num : set) {
            // Start of a sequence (only process the smallest number in a sequence)
            if (!set.contains(num - 1)) {
                int currentValue = num;
                int currentCount = 1; // Start the count with the current number

                // Expand the sequence
                while (set.contains(currentValue + 1)) {
                    currentValue++;
                    currentCount++;
                }

                // Update the longest sequence length
                ans = Math.max(ans, currentCount);
            }
        }

        return ans;
    }
}
