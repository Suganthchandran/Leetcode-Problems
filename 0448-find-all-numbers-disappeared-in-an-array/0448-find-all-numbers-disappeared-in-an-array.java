class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        int n = nums.length;

        int i=0;
        while(i<n) {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }

        for(int j=0;j<n;j++) {
            if(j!=nums[j]-1) {
                a.add(j+1);
            }
        }

        return a;
    }

    public void swap(int[] nums,int a,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}