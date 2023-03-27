class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int j = nums.length - 1;
        int maxSum = Integer.MIN_VALUE;
       
        for(int i = 0; i < nums.length / 2; i++){
            
            if(nums[i] + nums[j] > maxSum){
                maxSum = nums[i] + nums[j];
            } 
            j--;
        }
        
        return maxSum;
    }
}