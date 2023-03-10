class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            int counter = 0;
            
            for(int j = 0; j < nums.length; j++){
                if(nums[i] != nums[j] && nums[j] < nums[i]){
                    counter++;
                }
            }
            
            array[i] = counter;
        }
        return array;
    }
}