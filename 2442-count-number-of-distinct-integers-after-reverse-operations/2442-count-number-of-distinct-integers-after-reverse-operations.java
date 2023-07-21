class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], 1);
            map.put(reverse(nums[i]), 1);
        }
        return map.size();
    }
    
    public int reverse(int num){
        int result = 0;
        
        while(num > 0){
           result = (result * 10) + (num % 10); 
            num /= 10;
        }
        return result;
    }
}