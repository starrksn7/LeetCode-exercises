class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums.length == 2){
                    output[0] = 0;
                    output[1] = 1;
                } else if(j == i){
                    continue;
                } else if (nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        
        return output;
    }
}