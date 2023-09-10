class Solution {
    public int dominantIndex(int[] nums) {
        
        int greatest = Integer.MIN_VALUE;
        int greatestIndex = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > greatest){
                greatest = nums[i];
                greatestIndex = i;
            }
        }
        
        int result = 1;
        
        for(int num : nums){
            if(greatest >= num * 2){
                result++;
            }
        }

        return result == nums.length ? greatestIndex : -1;
    }
}