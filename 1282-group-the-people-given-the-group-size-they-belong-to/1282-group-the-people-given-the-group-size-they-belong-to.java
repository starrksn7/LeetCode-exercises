class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
       HashMap<Integer, List<Integer>> map = new HashMap<>();
       List<List<Integer>> results = new ArrayList<>();
        
        for(int i = 0; i < groupSizes.length; i++){
            int size = groupSizes[i];
            
            List<Integer> subList = map.getOrDefault(size, new ArrayList());
            subList.add(i);
            map.put(size, subList);
                
            if(subList.size() == size){
                results.add(subList);
                map.remove(size);
            }
        }        
     return results;   
   }
}
