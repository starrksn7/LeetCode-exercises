class Solution {
    public int thirdMax(int[] nums) {
        
        if(nums.length == 2){
           if(nums[0] >= nums[1]){
            return nums[0];
        } else if(nums[1] > nums[0]) {
            return nums[1];
        }
        }
        Integer maximum = null;
        Integer maximum2 = null;
        Integer maximum3 = null;
        
        for(Integer number : nums){
            if(number.equals(maximum) || number.equals(maximum2) || number.equals(maximum3)){
                continue;
            } else if(maximum == null || number > maximum){
                maximum3 = maximum2;
                maximum2 = maximum;
                maximum = number;
            } else if(maximum2 == null || number > maximum2){
                maximum3 = maximum2;
                maximum2 = number;
            } else if(maximum3 == null || number > maximum3){
                maximum3 = number;
            }
            
        }
        
        if(maximum3 != null){
            return maximum3;
        }
        
        return maximum;
    }
}