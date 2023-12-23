class Solution {
    public long pickGifts(int[] gifts, int k) {
        long result = 0;
        int n = gifts.length - 1;
        
        for(int i = 1; i <= k; i++){
            Arrays.sort(gifts);
            gifts[n] = (int) Math.floor(Math.sqrt(gifts[n])); 
        }
        
        for(int gift : gifts){
            result += gift;
        }
    
    return result;
    }
}