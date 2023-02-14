class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        
        for(int i = 0; i < nums.length; i++){
            int occurrences = 0;
            
            for(int j = 1; j < nums.length; j++){
                if(nums[j] == nums[i]){
                    occurrences++;
                }
            }
            
            if((nums.length / 2) <= occurrences){
                majorityElement = nums[i];
                break;
            }
        }
        return majorityElement;
    }
}