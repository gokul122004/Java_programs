class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int p : prices) {
            if(p < minPrice) {
                minPrice = p;
            } else if(p - minPrice > profit) {
                profit = p - minPrice;
            }
        }

        return profit;
    }
}