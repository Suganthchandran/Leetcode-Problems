class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int stone : stones) {
            queue.add(stone);
        }
        while(queue.size() > 1) {
            int stone1 = queue.remove();
            int stone2 = queue.remove();
            if(stone1 != stone2) {
                queue.add(stone1-stone2);
            }
        }
        return queue.isEmpty() ? 0 : queue.remove();
    }
}