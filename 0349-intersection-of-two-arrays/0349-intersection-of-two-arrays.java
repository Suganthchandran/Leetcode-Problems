class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        for(int num:nums1) {
            a.add(num);
        }

        for(int num : nums2) {
            if(a.contains(num)) {
                b.add(num);
            }
        }

        int[] res = new int[b.size()];
        int i=0;
        for(int num : b) {
            res[i++] = num;
        }

        return res;
    }
}