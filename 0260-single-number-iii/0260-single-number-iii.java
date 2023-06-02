class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> singles = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(singles.containsKey(nums[i])){
                singles.remove(nums[i]);
            } else {
                singles.put(nums[i], 0);
            }
        }
        
        Set<Integer> keys = singles.keySet();
        
        int[] array = new int[keys.size()];
        int index = 0;
        
        for(Integer key : keys){
            array[index] = key.intValue();
            index++;
        } ;
        
        
        
        return array;
    }
}