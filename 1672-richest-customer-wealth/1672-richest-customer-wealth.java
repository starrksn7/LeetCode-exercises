class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int highestTotal = Integer.MIN_VALUE;
        
        for(int i = 0; i < accounts.length; i++){
            int portionTotal = 0;
            
            for(int j = 0; j < accounts[i].length; j++){
                portionTotal += accounts[i][j];  
            }
            
            if(portionTotal > highestTotal){
                highestTotal = portionTotal;
            }
        }
    return highestTotal;
    }
}