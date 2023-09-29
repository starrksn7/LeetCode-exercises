class Solution {
    public boolean isMonotonic(int[] nums) {
        int increase = 1;
        int decrease = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i - 1] > 0){
                increase++;
            } else if(nums[i] - nums[i - 1] < 0){
                decrease++;
            } else{
                increase++;
                decrease++;
            }
        }
        
        return decrease == nums.length || increase == nums.length;
    }
}