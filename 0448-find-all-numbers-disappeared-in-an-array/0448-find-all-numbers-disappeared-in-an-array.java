class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a = new ArrayList<>();
        int i=0;

        while(i < nums.length) {
            if(nums[i] != nums[nums[i]-1]) {
                Swap(nums,i,nums[i]-1);
            }
            else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++) {
            if(nums[j] != j+1) {
                a.add(j+1);
            }
        }

        return a;
    }

    public void Swap(int[] nums,int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}