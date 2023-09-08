class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        
        for(int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }
        
        String[] result = new String[names.length];
        int index = 0;
        
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            result[index] = entry.getValue();
            index++;
        }
      
        return result;
    }
}
