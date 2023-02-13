class Solution {
    public int countOdds(int low, int high) {
       
        int output = (high - low) / 2;
        
        if(low % 2 == 1 || high % 2 == 1){
            output += 1;
        }
        
       return output;
    }
}

