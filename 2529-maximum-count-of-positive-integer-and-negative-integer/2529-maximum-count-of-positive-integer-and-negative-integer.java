class Solution {
    public int maximumCount(int[] nums) {
        int positiveTotal = 0;
        int negativeTotal = 0;
        
        for(int num : nums){
            if(num < 0){
                negativeTotal++;
            } else if (num > 0) {
                positiveTotal++;
            }
        }
        return positiveTotal >=  negativeTotal ? positiveTotal : negativeTotal;
    }
}