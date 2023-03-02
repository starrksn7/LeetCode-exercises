class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] results = new int[nums.length];
        
        for(int i = 1; i < nums.length; i++){
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        
        for(int j = nums.length - 2; j >= 0; j--){
            rightSum[j] = rightSum[j + 1] + nums[j + 1];
        }
        
        for(int k = 0; k < nums.length; k++){
            results[k] = Math.abs(leftSum[k] - rightSum[k]);
        }
        
        return results;
    }
}