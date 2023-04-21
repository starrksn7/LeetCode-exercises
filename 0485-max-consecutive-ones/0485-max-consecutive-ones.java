class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes = 0;
        int maximumOnes = 0;
        
        for(int number : nums){
            if(number == 0){
                consecutiveOnes = 0;
            } else {
                consecutiveOnes++;
                maximumOnes = Math.max(consecutiveOnes, maximumOnes);
            }
        }
        
        return maximumOnes;
    }
}