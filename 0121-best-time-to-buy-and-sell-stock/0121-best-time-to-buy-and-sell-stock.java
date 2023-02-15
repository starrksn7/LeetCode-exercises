class Solution {
    public int maxProfit(int[] prices) {
       
        int highestPrice = 0;
        int lowestPrice = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            lowestPrice = Math.min(lowestPrice, prices[i]);
            highestPrice = Math.max(highestPrice, prices[i] - lowestPrice);
        }
        
        return highestPrice;
        
        
    }
}