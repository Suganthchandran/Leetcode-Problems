class Solution {
    public int maxProfit(int[] p) {
        int minPrice = p[0];
        int maxPrice = 0;

        for(int i=0;i<p.length;i++) {
            if(p[i] < minPrice) {
                minPrice = p[i];
            }

            if(p[i]-minPrice > maxPrice) {
                maxPrice = p[i]-minPrice;
            }
        }
        return maxPrice;
    }
}