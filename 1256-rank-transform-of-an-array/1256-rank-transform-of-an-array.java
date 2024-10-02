class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] duplicate = Arrays.copyOf(arr,arr.length);
        Arrays.sort(duplicate);

        int rank = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : duplicate) {
            if(!map.containsKey(num)) {
                map.put(num,rank++);
            }
        }
        int res[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}