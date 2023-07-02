class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        
        int purchases = 0;
        
        for(int i = 0; i < costs.length; i++){
            if(coins >= costs[i]){
                purchases++;
                coins -= costs[i];
            }
        }
        
        return purchases;
    }
}