class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> results = new HashMap<>();
        
        for(int num : nums){
            if(results.containsKey(num)){
                results.replace(num, results.get(num) + 1);
            } else {
                results.put(num, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : results.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}