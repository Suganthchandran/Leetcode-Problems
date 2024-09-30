class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxheap = 
            new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        maxheap.addAll(map.entrySet());

        int[] res = new int[k];
        for(int i=0;i<k;i++) {
            res[i] = maxheap.poll().getKey();
        }
        return res;
    }
}