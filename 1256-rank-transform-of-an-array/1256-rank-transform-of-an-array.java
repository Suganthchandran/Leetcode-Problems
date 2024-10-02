class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] duplicate = new int[n];

        for(int i=0;i<n;i++) {
            duplicate[i] = arr[i];
        }

        Arrays.sort(duplicate);

        int rank = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : duplicate) {
            if(!map.containsKey(num)) {
                map.put(num,rank++);
            }
        }
        int res[] = new int[n];
        for(int i=0;i<arr.length;i++) {
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}