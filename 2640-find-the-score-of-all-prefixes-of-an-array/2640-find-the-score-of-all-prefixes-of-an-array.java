class Solution {
    public long[] findPrefixScore(int[] nums) {
      long max = 0;
      long total = 0;
      long[] result = new long[nums.length];
        
      for(int i = 0; i < nums.length; i++){
        if(nums[i] > max){
            max = nums[i];
        }  
          result[i] = nums[i] + max + total;
          total = result[i];
      }
        return result;
    }
}