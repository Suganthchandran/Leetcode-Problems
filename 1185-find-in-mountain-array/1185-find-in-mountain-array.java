/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak = peak(arr);
        int FirstTry = Binary(arr,target,0,peak,true);
        if(FirstTry != -1)
            return FirstTry;
        
        return Binary(arr,target,peak+1,arr.length()-1,false);
    }

    public int peak(MountainArray arr) {
        int s = 0;
        int e = arr.length()-1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr.get(mid) <= arr.get(mid + 1)) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    public int Binary(MountainArray arr, int target, int start, int end, boolean Asce) {
        while(start<=end) {
            int mid = start+(end-start)/2;

            if(arr.get(mid) == target) {
                return mid;
            }
            if(Asce) {
                if(arr.get(mid) > target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(arr.get(mid) > target) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            
        }
        return -1;
    }
}