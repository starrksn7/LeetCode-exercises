class Solution {
    public int findMaxK(int[] nums) {
        int result = -1;
        List<Integer> list = new ArrayList<>();
        
        for(int num : nums){
            list.add(num);
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 && list.contains(-nums[i]) && nums[i] > result){
                result = nums[i];
            }
        }
        
        return result;
    }
}