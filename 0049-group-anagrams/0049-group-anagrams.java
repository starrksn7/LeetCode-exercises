class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String string = String.valueOf(chars);
            if(!map.containsKey(string)){
                map.put(string, new ArrayList<>());
            }
            map.get(string).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}