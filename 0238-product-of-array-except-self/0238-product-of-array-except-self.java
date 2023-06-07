class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int total = 1;
        
        for(int i = 0; i < nums.length; i++){
            results[i] = total;
            total *= nums[i];
        }
        
        total = 1;
        for(int j = nums.length - 1; j >= 0; j--){
            results[j] *= total;
            total *= nums[j];
        }
        return results;
    }
}

