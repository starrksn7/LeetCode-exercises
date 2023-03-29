class Solution {
    public int[] finalPrices(int[] prices) {
        int[] results = new int[prices.length];
        
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    results[i] = prices[i] - prices[j];
                    break;
                } else {
                    results[i] = prices[i];
                }
            }    
        }
        results[prices.length - 1] = prices[prices.length - 1];
        
        return results;
    }
}