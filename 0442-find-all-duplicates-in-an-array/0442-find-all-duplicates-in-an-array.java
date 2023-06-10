class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> results = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int number : nums){
            if(map.containsKey(number)){
                map.replace(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                results.add(entry.getKey());
            }
        }
        
        return results;
    }
}