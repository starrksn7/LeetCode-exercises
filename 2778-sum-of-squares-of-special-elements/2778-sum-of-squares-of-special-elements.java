class Solution {
    public int sumOfSquares(int[] nums) {
        int result = 0;
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if(n % (i + 1) == 0){
                result += Math.pow(nums[i], 2);
            }
        }
        
        return result;
    }
}