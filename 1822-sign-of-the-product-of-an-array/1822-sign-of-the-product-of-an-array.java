class Solution {
    public int arraySign(int[] nums) {
        int total = 0;
        
        for(int num : nums){
            if(num == 0){
                return 0;
            }
            
            if(num < 0){
                total++;
            }
        }
        
        return total % 2 == 0 ? 1 : -1;
    }
}