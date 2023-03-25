class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> uniqueNumbers = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
           uniqueNumbers.put(nums[i], uniqueNumbers.getOrDefault(nums[i], 0) + 1);
           if(uniqueNumbers.get(nums[i]) == 1){
               sum += nums[i];
           } else if(uniqueNumbers.get(nums[i]) == 2) {
               sum -= nums[i];
           }
        }
        
        
     return sum;   
    }
}