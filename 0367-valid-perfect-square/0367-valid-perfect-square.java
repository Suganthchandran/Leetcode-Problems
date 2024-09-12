class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false; // Edge case for non-positive numbers
        if (num == 1) return true; // 1 is a perfect square

        long start = 1;
        long end = num;

        while (start <= end) { 
            long mid = start + (end - start) / 2;
            long res = mid * mid;

            if (res == num) {
                return true;
            } else if (res < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
