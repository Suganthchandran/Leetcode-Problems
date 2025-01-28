class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length);
        return nums;
    }

    public void mergeSort(int[] nums, int s, int e) {
        if(e-s == 1) {
            return;
        }
        int mid = (s+e)/2;
        mergeSort(nums,s,mid);
        mergeSort(nums,mid,e);
        merge(nums,s,e,mid);
    }

    public void merge(int[] nums, int s, int e, int m) {
        int[] mix = new int[e-s];
        int i=s,j=m,k=0;
        while(i<m && j<e) {
            if(nums[i] < nums[j]) {
                mix[k] = nums[i];
                i++;
            }
            else {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i<m) {
            mix[k] = nums[i];
            i++;
            k++;
        }

        while(j<e) {
            mix[k] = nums[j];
            j++;
            k++;
        }

        for(int t=0;t<mix.length;t++) {
            nums[t+s] = mix[t];
        }
    }

    
}