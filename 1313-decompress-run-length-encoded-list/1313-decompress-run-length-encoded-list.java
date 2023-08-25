class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 1; i+=2){
            int freq = nums[i];
            
            while(freq > 0){
                list.add(nums[i + 1]);
                freq--;
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++){
            result[j] = list.get(j);
        }
        
        return result;
    }
}