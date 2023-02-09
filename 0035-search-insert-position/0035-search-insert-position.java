class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int index = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(i == nums.length - 1 && target > nums[i]){
                index = i + 1;
            } else if(nums[i] >= target){
                index = i;
                break;
            } 
        }
        
        return index;
    }
}