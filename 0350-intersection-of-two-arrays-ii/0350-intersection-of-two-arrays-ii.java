class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0,k=0;
        ArrayList<Integer> a = new ArrayList<>();

        while(i<len1 && j<len2) {
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else {
                a.add(nums1[i++]);
                j++;
            }
        }

        int res[] = new int[a.size()];
        int s=0;
        for(int num : a) {
            res[s++] = num;
        }

        return res;
    }
}