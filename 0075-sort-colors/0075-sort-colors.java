class Solution {
    public void sortColors(int[] nums) {
        int reds = 0;
        int whites = 0;
        int blues = 0;
        
        for(int num : nums){
            if(num == 0){
                reds++;
            } else if(num == 1){
                whites++;
            } else {
                blues++;
            }
        }
        
        for(int i = 0; i < reds; i++){
            nums[i] = 0;
        }
        
        for(int j = reds; j < reds + whites; j++){
            nums[j] = 1;
        }
        
        for(int k = reds + whites; k < nums.length; k++){
            nums[k] = 2;
        }
    }
}