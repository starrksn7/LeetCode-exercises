class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int result = 0;
        
        for(int i = 0; i < nums.size(); i++){
            
            for(int j = 0; j < nums.size(); j++){
                if(i != j){
                    if(nums.get(i) + nums.get(j) < target){
                        result++;
                    }
                }
            }
        }
        
        return result / 2;
    }
}